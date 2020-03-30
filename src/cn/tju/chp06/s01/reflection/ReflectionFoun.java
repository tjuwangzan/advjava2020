package cn.tju.chp06.s01.reflection;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;

public class ReflectionFoun {

	public static void main(String[] args) throws ClassNotFoundException {
		Date date = new Date();
		Class clazz1 = date.getClass();
		Class clazz2 = Date.class;
		Class clazz3 = Class.forName("java.util.Date");
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);
		
		Method[] methods = clazz1.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

	}

}
