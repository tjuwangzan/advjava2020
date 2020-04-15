package cn.tju.chp08.s07.lock;

public class ReentryLockDemo {
	
	public synchronized void a() {
		System.out.println("a");
//		b();
	}
	
	public synchronized void b() {
		System.out.println("b");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ReentryLockDemo demo = new ReentryLockDemo();

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo.a();
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo.b();
			}
		}).start();
	}

}
