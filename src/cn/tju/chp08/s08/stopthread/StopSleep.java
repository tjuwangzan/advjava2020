package cn.tju.chp08.s08.stopthread;

public class StopSleep {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = ()->{
			int count = 0;
			try {
				while(count<=300 && (!Thread.currentThread().isInterrupted())) {
					if (count %100==0) {
						System.out.println(count + "是100的倍数");
					}
					count++;
				} 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		Thread.sleep(500); 
		thread.interrupt(); //当前面的线程正在运行的时候，中断
	}

}
