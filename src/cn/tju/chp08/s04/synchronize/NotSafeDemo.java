package cn.tju.chp08.s04.synchronize;

public class NotSafeDemo implements Runnable{
	static NotSafeDemo nsd = new NotSafeDemo();
	static int j = 0;
	
	public static void main(String[] args) throws Exception {
		Thread th1 = new Thread(nsd);
		Thread th2 = new Thread(nsd);
		
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		
		System.out.println(j); //200000
	}
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			j++;
		}		
	}

}
