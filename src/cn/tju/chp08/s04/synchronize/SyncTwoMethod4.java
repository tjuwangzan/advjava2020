package cn.tju.chp08.s04.synchronize;

public class SyncTwoMethod4 implements Runnable{
	
	public synchronized void m1() throws InterruptedException {
		System.out.println("被synchronized修饰，线程名：" + Thread.currentThread().getName());
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + "执行完毕");
	}
	
	public  void m2() throws InterruptedException {
		System.out.println("未被synchronized修饰，线程名：" + Thread.currentThread().getName());
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + "执行完毕");
	}
	
	public static void main(String[] args) throws InterruptedException {
		SyncTwoMethod4 stm1 = new SyncTwoMethod4();
				 
		Thread t1 = new Thread(stm1);
		Thread t2 = new Thread(stm1);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		if("Thread-0".equals(Thread.currentThread().getName())) {
			try {
				m1();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else if("Thread-1".equals(Thread.currentThread().getName())) {
			try {
				m2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
