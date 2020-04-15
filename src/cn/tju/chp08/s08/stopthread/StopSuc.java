package cn.tju.chp08.s08.stopthread;

public class StopSuc {
	public static void main(String[] args) {
		StopThread2 st = new StopThread2();
		Thread thread = new Thread(st,"线程1");
		
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		st.isRunning = false;
		System.out.println("End");
	}

}

class StopThread2 implements Runnable{
	public volatile boolean isRunning = true;
	public volatile int j=0;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "start running!");
		
		while(isRunning && j<3) {
			for (int i = 1; i < 6; i++) {
				System.out.println(name + "执行了[" + i + "]次");
			}
			j++;
			
			
		}
		System.out.println(name + "执行结束！");
		
		
	}
}