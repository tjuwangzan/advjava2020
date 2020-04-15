package cn.tju.chp08.s04.synchronize;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 不适用的场景:不保证原子性
 * 
 * @author wangzan
 *
 */
public class VolatileNull implements Runnable{
	volatile int j = 0;
	AtomicInteger a = new AtomicInteger();
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			j++;
			a.incrementAndGet();
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
		System.out.println(task.a);
	}
	
	
}
