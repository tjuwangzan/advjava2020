package cn.tju.chp08.s04.synchronize;

public class SyncTwoMethod3 implements Runnable{
	
	
	public static synchronized void m1() throws InterruptedException {
		System.out.println("被静态synchronized修饰，线程名：" + Thread.currentThread().getName());
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + "执行完毕");
	}
	
	public static void main(String[] args) throws InterruptedException {
		SyncTwoMethod3 stm1 = new SyncTwoMethod3();
		SyncTwoMethod3 stm2 = new SyncTwoMethod3();
		 
		Thread t1 = new Thread(stm1,"线程1");
		Thread t2 = new Thread(stm2,"线程2");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		try {
			m1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
