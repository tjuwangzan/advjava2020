package cn.tju.chp08.s01.threadintro;

class MyFirstThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
	}
}

public class FirstThread {
	public static void main(String[] args) {
		MyFirstThread mft = new MyFirstThread();
		Thread th1 = new Thread(mft);
		th1.start();
		

	}

}
