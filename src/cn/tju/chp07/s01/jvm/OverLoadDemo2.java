package cn.tju.chp07.s01.jvm;

public class OverLoadDemo2 {
	
	public void sayHello(short a) {
		System.out.println("short");
	}
	
	public void sayHello(int a) {
		System.out.println("int");
	}
	
	public void sayHello(long a) {
		System.out.println("long");
	}
	
//	public void sayHello(char a) {
//		System.out.println("char");
//	}
	
	public void sayHello(Character a) {
		System.out.println("character");
	}
	
	public void sayHello(Object a) {
		System.out.println("Object");
	}
	
	public void sayHello(char... a) {
		System.out.println("char...");
	}
	
	public static void main(String[] args) {
		new OverLoadDemo2().sayHello('a');
	}
	

}
