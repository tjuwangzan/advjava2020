package cn.tju.chp08.s01.threadintro;

class MyThreadName implements Runnable{
	private String name;
	public MyThreadName() {	}
	
	public MyThreadName(String name) {
		this.name = name;
	}
	@Override
	public  void run() {
		System.out.println(Thread.currentThread().getName());
	
	}
}

public class ThreadRunnableNameDemo {

	public static void main(String[] args) {
		
		MyThreadName mt = new MyThreadName();
		
//		new Thread(mt).start();
		new Thread(mt,"线程A").start();
//		mt.run();
		
//		new Thread(mt).start();

	}

}
