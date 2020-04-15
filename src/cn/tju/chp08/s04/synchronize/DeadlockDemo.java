package cn.tju.chp08.s04.synchronize;

class DlExample{
	private Object obj1 = new Object();
	private Object obj2 = new Object();
	
	public void method1(){
		synchronized (obj1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("拿到obj1的锁，在等obj2的锁....");
			synchronized (obj2) {
				System.out.println("method1");
			}
		}
	}
	
	public void method2(){
		synchronized (obj2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("拿到obj2的锁，在等obj1的锁....");
			synchronized (obj1) {
				System.out.println("method2");
			}
		}
		
	}
}


public class DeadlockDemo {

	public static void main(String[] args) {
		DlExample example = new DlExample();
		
		Thread dlt1 = new Thread(()->example.method1(),"t1");
		Thread dlt2 = new Thread(()->example.method2(),"t2");
		
		dlt1.start();
		dlt2.start();

	}

}
