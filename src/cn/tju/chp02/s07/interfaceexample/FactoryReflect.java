package cn.tju.chp02.s07.interfaceexample;

public class FactoryReflect {
	public static Drawable5 getInstance(String s) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Drawable5 d ;
		
		Class<?> c = Class.forName("cn.tju.scs.c01.interfaceexample." + s);
		Object obj = c.newInstance();
		d = (Drawable5)obj;
		return d;
	} 

}
