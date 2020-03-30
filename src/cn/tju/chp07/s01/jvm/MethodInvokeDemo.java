package cn.tju.chp07.s01.jvm;

public class MethodInvokeDemo {
	
	public static void sayHello() {
		System.out.println("Hello Java");
	}
	public static void main(String[] args) {
		MethodInvokeDemo.sayHello();
		int a =1  ;
		long b =2L;
		int c = 3;
		System.out.println(a+b + c);
	}

}
