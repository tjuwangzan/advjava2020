package cn.tju.chp08.s04.synchronize;

public class ReentrDemo2 {
	int a = 0;
	public static void main(String[] args) {
		ReentrDemo2 rd = new ReentrDemo2();
		rd.method1();
	}
	
	public synchronized void method1() {
		System.out.println("我是方法1");
		method2();
	}
	
	public synchronized void method2() {
		System.out.println("我是方法2");
	}
	
	

}
