package cn.tju.chp02.s07.interfaceexample;

interface A {
	public abstract void print(); 
}

interface B{
	public abstract void get();
}

class X implements A, B{

	@Override
	public void get() {
		System.out.println("Get B");
	}

	@Override
	public void print() {
		System.out.println("Print A");
		
	}
	
}

public class InterfaceFirst {

	public static void main(String[] args) {
		X x = new X();
		A a = x;
		B b = x;
		a.print();
		b.get();
	}
	
//	public static void main(String[] args) {
//		A a = new X();
//		a.print();
//		B b = (B)a;
//		b.get();
//	}

}
