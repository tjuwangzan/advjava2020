package cn.tju.chp08.s02.threadstate;

public class NewRunTerm implements Runnable{

	public static void main(String[] args) {
		Thread th1 = new Thread(new NewRunTerm());
		System.out.println("1." + th1.getState());
		th1.start();
		System.out.println("2." + th1.getState());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("3." +th1.getState());

	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		
	}

}
