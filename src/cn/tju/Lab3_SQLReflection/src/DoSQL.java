import anoot.Column;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoSQL implements SQLUtil {
    private static StringBuilder condition = new StringBuilder();
    private static StringBuilder[] attrValue  = new StringBuilder[2];
    private final int TYPE_ATTR  = 0;
    private final int TYPE_VALUE = 1;

    public DoSQL(){
        attrValue[0] = new StringBuilder();
        attrValue[1] = new StringBuilder();
    }

    /**
     * Ways to use annotation:
       @Table  检查类是否包含该注解，若包含则是可操作的对象
       @Column 通过获取该注解值，得到字段名，调用对应的 get方法
       @Return SqlString
     */
    @Override
    // eg. SELECT * FROM user WHERE id = 175 AND...
    public String query(User user) {
        final String selFrom = "SELECT * FROM user WHERE ";
        ArrayList<Annotation> ants = new ArrayList<>();
        Field[] fields = user.getClass().getDeclaredFields();
        for (Field f: fields)
            ants.add(f.getAnnotation(Column.class));
        resetCondition();
        for (Annotation ant: ants)
        {
//            System.out.println("ant = " + ant);
            Column field = (Column)ant;
            try
            {
                String v = field.value();
                Method m = User.class.getMethod("get"+topCharToUpCase(v));
                Object obj_res = m.invoke(user);
                String str_res;
                if (obj_res instanceof Integer)
                    str_res = Integer.toString((Integer) obj_res);
                else str_res = (String)obj_res;

                // If the field is valid
                if (str_res != null && !str_res.equals("-1"))
                    addCondition(v, str_res);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e)
            {
                e.printStackTrace();
            }
        }
        return selFrom + getCondition();
    }

    @Override
    public String insert(User user) {
        final String ins = "INSERT INTO user";

        // <to be modified> Duplicate code, just like query()
        // Get information about user through "ants" reflection
        ArrayList<Annotation> ants = new ArrayList<>();
        Field[] fields = user.getClass().getDeclaredFields();
        for (Field f: fields)
            ants.add(f.getAnnotation(Column.class));
        resetAttr();
        for (Annotation ant: ants)
        {
            if (ant instanceof Column)
            {
                Column field = (Column)ant;
                try
                {
                    String v = field.value();
                    Method m = User.class.getMethod("get"+topCharToUpCase(v));
                    Object obj_res = m.invoke(user);
                    String str_res;
                    if (obj_res instanceof Integer)
                        str_res = Integer.toString((Integer) obj_res);
                    else str_res = (String)obj_res;

                    // If the field is valid
                    if (str_res != null && ! str_res.equals("-1"))
                    {
                        addAttr(v, TYPE_ATTR);
                        addAttr(str_res, TYPE_VALUE);
                    }
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return ins + getAttr(TYPE_ATTR) + " VALUES" + getAttr(TYPE_VALUE);
    }

    @Override
    // eg. INSERT INTO `user` (`username`, `telephone`, `email`, `age`)
    // VALUES ('user', '12345678123', 'user@123.com', 20), ('user2', '12345678121', 'user2@123.com', 20)
    public String insert(List<User> users) {
        if (users.isEmpty()) return null;
        StringBuilder res = new StringBuilder();
        res.append(insert(users.get(0)));
        for (int i = 1; i < users.size(); i++)
        {
            String otherVal = insert(users.get(i));
//            System.out.println("otherVal = " + otherVal);
            Pattern p = Pattern.compile("\\([\\d\\w\\s@.,]*\\)$");
            Matcher m = p.matcher(otherVal);
            if (m.find()) res.append(", ").append(m.group());
        }
        return res.toString();
    }

    @Override
    // eg. DELETE FROM `user` WHERE `id` = 1;
    public String delete(User user) {
        final String res_pre = "DELETE FROM user ";
        String res_post = query(user);
        Pattern p = Pattern.compile("WHERE .*$");
        Matcher m = p.matcher(res_post);
        if (m.find())
            return res_pre + m.group();
        return null;
    }

    @Override
    // eg. UPDATE `user` SET `email` = 'change@123.com' WHERE `id` = 1;
    public String update(User user) {
        final String res_pre = "UPDATE user SET ";
        String query_info = query(user);

        // Get id info
        Pattern p1 = Pattern.compile("id = \\d+");
        Matcher idMat = p1.matcher(query_info);
        String id_info = "";
        if (idMat.find()) id_info = idMat.group();
        query_info = query_info.replaceFirst(id_info, "");
        // Get set info
        Pattern p2 = Pattern.compile("\\w+ = \\S+");
        Matcher setinfoMat = p2.matcher(query_info);
        StringBuilder set_info = new StringBuilder();
        if (setinfoMat.find())
            set_info.append(setinfoMat.group());
        while (setinfoMat.find())
            set_info.append(" AND ").append(setinfoMat.group());

        return res_pre + set_info + " WHERE " + id_info;
    }

    private static String topCharToUpCase(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        sb.append(s.substring(1));
        return sb.toString();
    }

    private static void addCondition(String field, String res){
        String con = field + " = " + res + " ";
        if (condition.length() == 0)
            condition.append(con);
        else
            condition.append("AND ").append(con);
    }

    private static void resetCondition(){
        condition.delete(0, condition.length());
    }

    private static String getCondition(){
        return condition.toString();
    }

    private static void addAttr(String s, int type){
        if (attrValue[type].length() == 0)
        {
            attrValue[type] = new StringBuilder();
            attrValue[type].append("(").append(s);
        }
        else
            attrValue[type].append(", ").append(s);
    }

    private static void resetAttr(){
        attrValue[0].delete(0, attrValue[0].length());
        attrValue[1].delete(0, attrValue[1].length());
    }

    private static String getAttr(int type){
        // eg. (username, age, email) OR (shiQi, 20, 198800981@hotmail.com)
        return attrValue[type].toString().concat(")");
    }

    public static void main(String[] args) {
//        // [Test] topCharToUpCase(String s) --> PASS
//        System.out.println(topCharToUpCase("id"));
//        System.out.println(topCharToUpCase("user"));
//        System.out.println(topCharToUpCase("heLLO"));

//        // [Test] methods of condition --> PASS
//        resetCondition();
//        addCondition("id", "123");
//        addCondition("email", "1045663214@hotmail.com");
//        addCondition("username", "shiQi");
//        // resetCondition();
//        System.out.println("WHERE " + getCondition());

    }
}
