package cn.tju.chp08.s02.threadstate;

public class BlockedWaitT implements Runnable{
	public static void main(String[] args) {
		BlockedWaitT brun = new BlockedWaitT();
		Thread th1 = new Thread(brun);
		Thread th2 = new Thread(brun);				
		th1.start();
		th2.start();		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("线程1的状态：" + th1.getState());
		System.out.println("线程2的状态：" + th2.getState());
		
		try {
			Thread.sleep(1300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程1之后的状态：" + th1.getState());
	}

	@Override
	public void run() {
		syn();
	}
	
	private synchronized void syn() {
		try {
			Thread.sleep(1000);
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
