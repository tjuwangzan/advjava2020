package cn.tju.chp08.s03.thread;

public class SleepDemo2 implements Runnable{
	
	public static void main(String[] args) {
		SleepDemo2 sd2 = new SleepDemo2();
		new Thread(sd2).start();
		new Thread(sd2).start();
	}
	@Override
	public void run() {
		syn();
	}
	
	private synchronized void syn() {
		System.out.println(Thread.currentThread().getName() + " get the monitor");
		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " wake up");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
