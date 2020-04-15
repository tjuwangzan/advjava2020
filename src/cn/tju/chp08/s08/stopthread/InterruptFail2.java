package cn.tju.chp08.s08.stopthread;
/**
 * catch了InterrupttedException之后，在方法前面中抛出异常
 * @author wangzan
 *
 */
public class InterruptFail2 implements Runnable{
	@Override
	public void run() {
		while(true && !Thread.currentThread().isInterrupted()) {
			System.out.println("test");
			try {
				throwInMethod();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("出现异常，需要处理");
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
		
	}
	
	private void throwInMethod() throws InterruptedException  {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new InterruptFail2();
		Thread thread = new Thread(runnable);
		thread.start();
		Thread.sleep(1000); 
		thread.interrupt(); //当前面的线程正在运行的时候，中断
	}

	
	

}
