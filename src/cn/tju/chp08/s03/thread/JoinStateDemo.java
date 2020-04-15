package cn.tju.chp08.s03.thread;

public class JoinStateDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread mainTh = Thread.currentThread();
		Thread th1 = new Thread(()-> {
			try {
				Thread.sleep(3000);
				System.out.println("主线程的状态： "+mainTh.getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}); 
		th1.start();
		System.out.println("等待子线程运行完成");
		th1.join();
		System.out.println("子线程运行完毕");
	}

}

class Runjoin implements Runnable{
	Thread th;
	public Runjoin(Thread thread) {
		this.th = thread;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("主线程的状态： "+th.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
