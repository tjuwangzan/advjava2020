package cn.tju.chp08.s03.thread;

public class YieldDemo {
	public static void main(String[] args) {
		YieldThread t = new YieldThread();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();

	}

}

class YieldThread implements Runnable{
		
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {			
			System.out.println(Thread.currentThread().getName() + "-" + i);
			if (i % 10 == 0) {
				Thread.yield();
			}
			
		}
	}
}
