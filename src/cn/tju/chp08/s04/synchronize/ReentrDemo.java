package cn.tju.chp08.s04.synchronize;

public class ReentrDemo {
	int a = 1;
	public static void main(String[] args) {
		ReentrDemo rd = new ReentrDemo();
		rd.method1();
	}
	
	public synchronized void method1() {
		System.out.println("第"+a+"次锁");
		if (a==1) {
			a++;
			method1();
		}
	}
	
	

}
