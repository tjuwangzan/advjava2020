package cn.tju.chp08.s02.threadstate;

public class StateBlocked {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				c.increase();
			}			
		},"t1线程");
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				c.increase();
			}			
		},"t2线程");
		t2.start();
		Thread.sleep(100);
		System.out.println("t2的状态："+ t2.getState());
	}

}

class Counter{
	 int counter;
     public synchronized void increase() {
         counter++;
         try {
             Thread.sleep(3000);
             System.out.println(Thread.currentThread().getName());
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
}