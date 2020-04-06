package cn.tju.chp08.s01.threadintro;

public class StartTwice {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		th1.start();
		th1.start();
	}

}
