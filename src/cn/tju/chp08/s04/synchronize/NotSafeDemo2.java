package cn.tju.chp08.s04.synchronize;

public class NotSafeDemo2 implements Runnable{
	private int count = 100;
	
	@Override
	public  void run() {
		count--;
		System.out.println(Thread.currentThread().getName() + ": count = " + count);
		
	}

	public static void main(String[] args) {
		NotSafeDemo2 ns = new NotSafeDemo2();
		for (int i = 0; i < 100; i++) {
			new Thread(ns,"Thread" + i).start();
		}

	}

}
