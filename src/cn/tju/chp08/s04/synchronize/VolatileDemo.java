package cn.tju.chp08.s04.synchronize;

public class VolatileDemo {
	int a = 1 ;
	public  int getA() {
		return a;
	}
	
	public synchronized void setA(int a) {
		
		this.a = a;
	}
	
	public static void main(String[] args) throws InterruptedException {
		while(true) {
			VolatileDemo demo = new VolatileDemo();
			Thread th1 = new Thread(()-> {
				demo.setA(2);
				},"AAA");
			th1.start();
			
//			System.out.println(demo.getA());
			new Thread(new Runnable() {
				
				@Override
				public void run() {

					System.out.print(demo.getA());
				}
			}).start();
			
			try {
	            Thread.sleep(100);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			System.out.println("/" + demo.getA());
		}
	}

}
