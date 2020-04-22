import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    DoSQL sqlUtil = new DoSQL();

        User user1 = new User();
	    user1.setId(1);
	    user1.setTelephone("13389012");
	    String res1 = sqlUtil.query(user1);
        System.out.println(res1);
        System.out.println();

        User user2 = new User();
        user2.setId(2);
        user2.setAge(23);
        user2.setUsername("London");
        String res2 = sqlUtil.insert(user2);
        System.out.println(res2);
        System.out.println();

        User user3 = new User();
        user3.setId(3);
        user3.setAge(18);
        user3.setUsername("Tianjin");
        List<User> users = new ArrayList<>(Arrays.asList(user3, user2));
        String res3 = sqlUtil.insert(users);
        System.out.println(res3);
        System.out.println();

        String res4 = sqlUtil.delete(user3);
        System.out.println(res4);
        System.out.println();

        String res5 = sqlUtil.update(user1);
        System.out.println(res5);
        System.out.println();
    }
}
