package cn.tju.chp07.s01.jvm;

class Parent{
	static int a = 3;
	static {
		int i = 4;
		System.out.println(i);
		System.out.println("Parent static block");
	}
}

class Child extends Parent{
	static int b =4;
	static {
		System.out.println("Child static block");
	}
}
public class ParentDemo {
	static {
		System.out.println("Demo static block");
	}
	public static void main(String[] args) {
//		System.out.println(Child.b);
		Parent parent;
		System.out.println("-------------");
		parent = new Parent();
		System.out.println(Parent.a);
		System.out.println(Child.b);
	}

}
