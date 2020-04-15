package cn.tju.chp08.s08.stopthread;

import java.sql.Date;

public class StopScuccess implements Runnable{
	@Override
	public void run() {
		long count = 0;
		long dt = System.currentTimeMillis();
		while (!Thread.currentThread().isInterrupted() && count <=3000000001L) {
			if (count %10000 == 0) {
				System.out.println(count +"是10000的倍数");
			}
			count++;
		}
		System.out.println("线程执行结束了，结束时间：" + (System.currentTimeMillis()-dt));
		
	}
	
	public static void main(String[] args) throws Exception {
		Thread thread = new Thread(new StopScuccess());
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
	}

}
