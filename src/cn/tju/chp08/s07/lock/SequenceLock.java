package cn.tju.chp08.s07.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SequenceLock {
	private static int value;
	
	Lock lock = new ReentrantLock();
	
	public  int getNext() {
		lock.lock();
		int a = value++;
		lock.unlock();
		return a;
	}
	
	public static  int getPrevious() {
		return value--;
	} 
	
	public int xx() {
		synchronized(this) {
			if (value>0) {
				return value;
			}else {
				return 0;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		SequenceLock s = new SequenceLock();
//		while(true) {
//			System.out.println(s.getNext());
//		}
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName() + "-"+s.getNext());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName() + "-"+s.getNext());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName() + "-"+s.getNext());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		
	}

}
