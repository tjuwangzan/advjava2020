package cn.tju.chp08.s04.synchronize;

public class VolatileDemo {
	private  int a = 1;
	public  int getA() {
		return a;
	}
	
	public  void setA(int a) {
		
		this.a = a;
	}
	
	public static void main(String[] args) {
		VolatileDemo demo = new VolatileDemo();
		new Thread(new Runnable() {			
			@Override
			public void run() {
				demo.setA(2);
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {

				System.out.println(demo.getA());
			}
		}).start();
	}

}
