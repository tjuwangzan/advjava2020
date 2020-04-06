package cn.tju.chp08.s01.threadintro;

public class BothRunThread {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("1来自Runnable");
			}
		}) {
			@Override
			public void run() {
//				super.run();
				System.out.println("1来自Thread");
			}
		}.start();
		
		Runnable run1 = new Runnable() {			
			@Override
			public void run() {
				System.out.println("2来自Runnable");
			}
		};
		
		Thread th1 = new Thread(run1) {
			@Override
			public void run() {
				System.out.println("2来自Thread");
			}
		};
		
		th1.start();
		

	}

}
