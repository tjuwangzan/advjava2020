package cn.tju.chp02.s04.polymorph;

public class B extends A {
	public B() {
		super();
//		System.out.println("B类的构造方法 " );
	}
	public void print() {
		System.out.println("Print B");		
	}
	
	public void funB() {
		System.out.println("B的扩充方法");
	}
}
