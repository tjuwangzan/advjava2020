package cn.tju.chp08.s04.waitnotify;

public class WaitDemo {
	public static Object object = new Object();
	static class Thread1 extends Thread{
		@Override
		public void run() {
			synchronized(object) {
				System.out.println(Thread.currentThread().getName() + "开始执行了...");//1
				try {
					object.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "重新获取了锁");//2
			}
		}
	}
	
	static class Thread2 extends Thread{
		@Override
		public void run() {
			synchronized(object) {
				System.out.println(Thread.currentThread().getName() + "开始执行了...");//3
				object.notify();
				System.out.println(Thread.currentThread().getName() + "调用了notify");//4
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		Thread.sleep(1000);
		th2.start();
		
	}

}


