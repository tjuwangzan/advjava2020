package cn.tju.chp06.s00.reflectbasic;

import java.lang.reflect.Field;

public class GetFields {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		Field[] fields = p.getClass().getDeclaredFields();
		for (Field field : fields) {
//			field.setAccessible(true);
			if (field.getName()!="age") {
				System.out.println(field.getName() + "--" + field.isAccessible());
				try {
					field.set(p, "test"+field.getName());
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		for (Field field : fields) {
			System.out.println(field.get(p));
		}
		
	}

}
