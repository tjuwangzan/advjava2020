package cn.tju.chp08.s04.synchronize;

public class SyncTwoMethod2 implements Runnable{
	
		
	public static void main(String[] args) throws InterruptedException {
		SyncTwoMethod2 stm1 = new SyncTwoMethod2();
		SyncTwoMethod2 stm2 = new SyncTwoMethod2();
		 
		Thread t1 = new Thread(stm1,"线程1");
		Thread t2 = new Thread(stm2,"线程2");
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("被synchronized修饰，线程名：" + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "执行完毕");
		}
	}

}
