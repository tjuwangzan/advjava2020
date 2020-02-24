package cn.tju.chp01;

public class Test {

	public static void main(String[] args) {
//		System.out.println("Hello World");
//		System.out.println("Hello 同学们！");
		Foo foo = new Foo();
		
		Class c1 = Foo.class;
		Class c2 = foo.getClass();
		try {
			Class c3 = Class.forName("cn.tju.chp01.Foo");
			System.out.print("getClass和Class.forName是一样的吗？");
			System.out.println(c2==c3);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("getClass和.class是一样的吗？");
		System.out.println(c1==c2);
		

	}
	
}

class Foo{}
