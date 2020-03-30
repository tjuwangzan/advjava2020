package cn.tju.chp06.s00.reflectbasic;

import java.lang.reflect.Field;

public class GetFields {
	public static void main(String[] args) throws Exception  {
//		1.定义Person对象
		Person p = new Person();
		
//		2.获取类信息
		Class c = p.getClass();
//		Field[] fields = c.getFields();
		Field[] fields = c.getDeclaredFields();
		
		
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.getName()!="age") {
				
				field.set(p, "test"+field.getName());				
			}			
		}
		
		for (Field field : fields) {
			System.out.println(field.get(p));
		}
		
		
		
	}

}
