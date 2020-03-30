package cn.tju.chp06.s01.reflection;

import java.lang.reflect.Constructor;

public class ReflectionConstructor {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("cn.tju.chp02.s02.encapsulation.CarEn");
		Constructor<?> cons[] = clazz.getConstructors();
		Constructor<?> con = clazz.getConstructor(String.class,double.class);
		Object obj = con.newInstance("大众",20.3);
		
		System.out.println(obj);

	}

}
