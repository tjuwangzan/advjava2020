package cn.tju.chp08.s04.synchronize;

public class VolatileNull implements Runnable{
	volatile int j = 0;
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			j++;			
		}
	}	
	public static void main(String[] args) throws InterruptedException {
		VolatileNull task = new VolatileNull();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(task.j);
	}
	
	
}
