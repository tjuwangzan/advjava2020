package cn.tju.chp07.s01.jvm;

public class OverLoadDemo {
	
	static class Parent{
		
	}
	
	static class Child1 extends Parent{}
	static class Child2 extends Parent{}
	
	public void sayHello(Child1 c) {
		System.out.println("c1 is call");
	}
	
	public void sayHello(Child2 c) {
		System.out.println("c2 is call");
	}
	
	public void sayHello(Parent p) {
		System.out.println("parent is call");
	}
	
	public static void main(String[] args) {
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		
		OverLoadDemo old = new OverLoadDemo();
		old.sayHello(p1);
		old.sayHello(p2);
		
		Parent p = new Child1();
		p = new Child2();
		old.sayHello((Child2)p);
		
	}

}
