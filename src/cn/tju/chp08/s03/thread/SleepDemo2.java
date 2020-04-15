package cn.tju.chp08.s03.thread;

public class SleepDemo2 implements Runnable{
	
	public static void main(String[] args) {
		SleepDemo2 sd2 = new SleepDemo2();
		Thread th1 = new Thread(sd2,"线程1");
		Thread th2 = new Thread(sd2,"线程2");
		
		th1.start();
		th2.start();
	}
	@Override
	public void run() {
		syn();
	}
	
	private synchronized void syn() {
		System.out.println(Thread.currentThread().getName() + " get the monitor");
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " wake up");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
