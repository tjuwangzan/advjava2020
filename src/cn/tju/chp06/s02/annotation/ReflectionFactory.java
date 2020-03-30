package cn.tju.chp06.s02.annotation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

interface Fruit{
	public void eat();
}

class Apple implements Fruit{

	@Override
	public void eat() {
		System.out.println("吃苹果");
	}
	
}

class Banana implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃香蕉");

	}
}

class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃橘子");
		
	}
}

class Watermelon implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃西瓜");	
		
	}
}

class Factory {
//	public static Fruit getInstance(String className){
//		if ("apple".equals(className)){
//			return new Apple();
//		} else if ("banana".equals(className)){
//			return new Banana();
//		}else if ("orange".equals(className)){
//			return new Orange(); 
//		}else{
//			return null;
//		}		
//	}
	
	public static Fruit getInstance(String className){
		Fruit f = null;
		try {
			f = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
}

@FactoryAnn(className="cn.tju.chp06.s02.annotation.Orange",methodName="eat")
public class ReflectionFactory {

	public static void main(String[] args) throws Exception {
		
//		1.解析注解
		Class<ReflectionFactory> cls = ReflectionFactory.class;
		FactoryAnn fann = cls.getAnnotation(FactoryAnn.class);
//		2.获取定义的值
		String className = fann.className();
		String methodName = fann.methodName();
//		3.调用方法
		Method m = Class.forName(className).getMethod(methodName);
		Fruit f = Factory.getInstance(className);
		m.invoke(f);
		
		
		   
		

	}

}
