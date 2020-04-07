package cn.tju.chp08.s01.threadintro;

class ThreadPriority implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ", i = " + i);
		}				
	}
	
}

public class PriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp = new ThreadPriority();
		Thread th1 = new Thread(tp,"自己的线程对象A");
		Thread th2 = new Thread(tp,"自己的线程对象B");
		Thread th3 = new Thread(tp,"自己的线程对象C");
		
		th1.setPriority(Thread.MAX_PRIORITY);
//		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MIN_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
