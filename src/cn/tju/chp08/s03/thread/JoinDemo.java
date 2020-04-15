package cn.tju.chp08.s03.thread;

public class JoinDemo {
	public static void main(String[] args) {
		JoinThread t1 = new JoinThread("线程A");
		JoinThread t2 = new JoinThread("线程B");
		t1.start();
		try {
			t1.join();
//			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}

class JoinThread extends Thread{
	public JoinThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);			
		}
	}
}
