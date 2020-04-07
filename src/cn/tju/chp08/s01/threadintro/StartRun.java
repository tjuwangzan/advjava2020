package cn.tju.chp08.s01.threadintro;

class Start implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": Hello");
	}
}

public class StartRun {

	public static void main(String[] args) {
//		for (int i = 0; i < 2; i++) {
			System.out.println("创建一个线程：");
			Start s = new Start();
			Thread t = new Thread(s);
			System.out.println("启动线程");
//			t.start();
			t.run();
//		}

	}

}
