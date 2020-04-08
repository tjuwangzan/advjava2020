package cn.tju.chp08.s04.synchronize;

public class SyncTwoMethod implements Runnable{
	int a = 100;
	
	public synchronized void m1() throws InterruptedException {
		a = 1000;
		Thread.sleep(1000);
		System.out.println("m1: a = " + a);
	}
	
	public synchronized void m2() throws InterruptedException {
		a = 2000;
		Thread.sleep(100);		
		System.out.println("m2: a = " + a);
	}
	
	public static void main(String[] args) throws InterruptedException {
		SyncTwoMethod stm = new SyncTwoMethod(); 
		Thread t = new Thread(stm);
		t.start();
		stm.m1();
		stm.m2();
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
