package cn.tju.chp08.s01.threadintro;

public class FirstThread {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		th1.start();
//		th1.run();
		System.out.println(th1.getName());
		System.out.println(th1.getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(th1.getPriority());
		System.out.println(th1.getState());
	}

}
