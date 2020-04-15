package cn.tju.chp08.s04.waitnotify;

public class WaitNotifyAllDemo implements Runnable{
	private static final Object object = new Object();
	@Override
	public void run() {
		synchronized (object) {
			System.out.println(Thread.currentThread().getName() + " 获得了object的锁");
			try {
				System.out.println(Thread.currentThread().getName() + " 开始等待");
				object.wait();
				System.out.println(Thread.currentThread().getName() + " 再次获得了object的锁，等待结束");
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new WaitNotifyAllDemo();
		Thread th1 = new Thread(runnable,"线程1");
		Thread th2 = new Thread(runnable,"线程2");
		Thread th3 = new Thread(()-> {
			synchronized (object) {
//				object.notifyAll();
				object.notify();
				System.out.println("线程3 通知了大家");
			}
		},"线程3");
		
		th1.start();
		th2.start();
		Thread.sleep(100);
		th3.start();
	}

}
