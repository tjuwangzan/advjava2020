package cn.tju.chp06.s00.reflectbasic;

public class ClassInfo {
	public static void main(String[] args) throws Exception {
		Class cls1 = Person[].class;
		Person p = new Person();
		Class cls2 = p.getClass();
		Class cls3 = Class.forName("cn.tju.chp06.s00.reflectbasic.Person");
		
		System.out.println(cls1.getName());
		System.out.println(cls1.getSimpleName());
		System.out.println(cls1.getCanonicalName());
		System.out.println(cls1.getPackage());
		
		Class clsint = String[][].class;
		System.out.println(clsint.getName());
		System.out.println(clsint.getSimpleName());
		System.out.println(clsint.getCanonicalName());
		System.out.println(clsint.getPackage());
		
	}

}
