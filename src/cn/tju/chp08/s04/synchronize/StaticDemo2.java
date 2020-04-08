package cn.tju.chp08.s04.synchronize;

public class StaticDemo2 {
	private static int count = 10;
	
	public synchronized static void meth() {
		count--;
		System.out.println(Thread.currentThread().getName() + " count =" + count);
	}
	
//	public static void mthis() {
//		synchronized (this) {
//			count--;
//		}
//	}
	
	public  void mclass() {
//		synchronized(StaticDemo2.class) {
			count--;
			System.out.println(Thread.currentThread().getName() + " count =" + count);
//		}
	}
	
	
	
	public static void main(String[] args) {
		StaticDemo2 sd = new StaticDemo2();
		
		for (int i = 0; i < 5; i++) {
			new Thread(()->sd.meth(),"t1").start();
			new Thread(()->sd.mclass(),"t2").start();
		}
		
	}

}

