package cn.tju.chp06.s01.reflection;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;

public class ReflectionFoun {

	public static void main(String[] args) throws ClassNotFoundException {
//		Date date = new Date();
//		Class<?> clazz = date.getClass();
//		Class<?> clazz = Date.class;
		Class<?> clazz = Class.forName("java.lang.Object");
		Class<?> clazz2 = Class.forName("java.lang.Object");
		System.out.println(clazz == clazz2);
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

	}

}
