package cn.tju.chp08.s08.stopthread;

public class VolatileStop implements Runnable{
	private volatile boolean exit = false;
	
	@Override
	public void run() {
		int count = 0;
		long starttime = System.currentTimeMillis();
		try {
			while(count <=100000 && !exit) {
				if (count%100==0) {
					System.out.println(count + "是100的倍数");
				}
				count++;
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		}
		System.out.println("总共运行的时间：" + (System.currentTimeMillis() - starttime));
	}
	public static void main(String[] args) throws InterruptedException {
		VolatileStop vs = new VolatileStop();
		Thread thread = new Thread(vs);
		thread.start();
		Thread.sleep(2000);
		vs.exit = true;
	}

}
