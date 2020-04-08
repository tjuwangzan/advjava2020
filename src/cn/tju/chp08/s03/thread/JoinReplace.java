package cn.tju.chp08.s03.thread;

public class JoinReplace {
	public static void main(String[] args) throws Exception {
		Thread th1 = new Thread(()-> {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		});
		
		th1.start();
		System.out.println("开始等待子线程运行完毕");
		synchronized (th1) {
			th1.wait();
		}
//		th1.join();
		System.out.println("Th1 Finished");
	}

}
