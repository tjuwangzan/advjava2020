package cn.tju.chp07.s01.jvm;

//import com.sun.nio.zipfs.*;

public class ClassLoaderFirstDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
		System.out.println(clazz.getClassLoader());
		Class clazz2 = Class.forName("cn.tju.chp07.s01.jvm.User");
		System.out.println(clazz2.getClassLoader());
		Class clazz3 = Class.forName("com.sun.nio.zipfs.ZipCoder");
		System.out.println(clazz3.getClassLoader());
//		System.out.println(System.getProperty("java.ext.dirs"));
	}

}
