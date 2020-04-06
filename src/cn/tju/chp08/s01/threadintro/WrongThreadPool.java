package cn.tju.chp08.s01.threadintro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WrongThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			executorService.submit(new Task());
		}
		
	}

}

class Task implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		
	}
}
