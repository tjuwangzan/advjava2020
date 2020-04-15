package cn.tju.chp08.s08.stopthread;

public class FirstStop {
	public static void main(String[] args) {
		StopThread st = new StopThread();
		Thread thread = new Thread(st,"线程1");
		
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.stop();
		System.out.println("End");
	}
}

class StopThread implements Runnable{
	public  boolean isRunning = true;
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " start running!");
		
		while(isRunning ) {
			for (int i = 1; i < 6; i++) {
				System.out.println(name + " 执行了[" + i + "]次");				
			}	
		}
		System.out.println(name + "执行结束！");	
	}
}