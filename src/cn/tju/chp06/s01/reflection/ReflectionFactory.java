package cn.tju.chp06.s01.reflection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;

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

public class ReflectionFactory {

	public static void main(String[] args) throws Exception {
//		Fruit f = Factory.getInstance("banana");
//		Fruit f = Factory.getInstance("cn.tju.chp06.s01.reflection.Watermelon");
//		f.eat();
		
		
//		File file = new File("D:/demo2020/config.txt");
//		try {
//			Scanner scan = new Scanner(file);
//			if (scan.hasNext()) {
//				String className = scan.next();
//				Fruit fruit = Factory.getInstance(className);
//				fruit.eat();
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Properties pro = new Properties();
		ClassLoader classLoader = ReflectionFactory.class.getClassLoader();
		InputStream in = classLoader.getResourceAsStream("sys.properties");
		pro.load(in);
		
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		
		Method m = Class.forName(className).getMethod(methodName);
		Fruit f = Factory.getInstance(className);
		m.invoke(f);
		   
		

	}

}
