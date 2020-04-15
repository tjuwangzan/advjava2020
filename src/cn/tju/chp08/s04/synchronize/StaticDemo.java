package cn.tju.chp08.s04.synchronize;

public class StaticDemo {
	private static int count = 10;
	Object object = new Object();
	public   void meth() {
		count--;
		System.out.println(Thread.currentThread().getName() + " count =" + count);
	}
	
//	public  void meth() {
//		synchronized(this) {
//			count--;
//			System.out.println(Thread.currentThread().getName() + " count =" + count);
//		}
//		
//	}
	
//	public static void mthis() {
//		synchronized (StaticDemo.class) {
//			count--;
//		}
//	}
	
	public static void mclass() {
		synchronized(StaticDemo.class) {
			count--;
			System.out.println(Thread.currentThread().getName() + " count =" + count);
		}
	}
	
	
	
	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();

		
		for (int i = 0; i < 100; i++) {
//			new Thread1(sd).start();
			new Thread2(sd).start();
		}
		
	}

}

class Thread1 extends Thread{
	StaticDemo sd ;
	public Thread1(StaticDemo sd) {
		this.sd = sd;
	}
	@Override
	public void run() {
//		System.out.println("Thread1 is running ...");
		sd.mclass();
	}
}

class Thread2 extends Thread{
	StaticDemo sd ;
	public Thread2(StaticDemo sd) {
		this.sd = sd;
	}
	@Override
	public void run() {
//		System.out.println("Thread2 is running ...");
		sd.meth();
	}
}
