package cn.tju.chp08.s04.synchronize;

public class VolatileDemo2 {
	volatile int a = 1 ;
	public  void setA(int a) {
		this.a = a;
	}
	
	public static void main(String[] args) throws InterruptedException {
			VolatileDemo2 demo = new VolatileDemo2();
			Thread th1 = new Thread(()-> {
				System.out.println(Thread.currentThread().getName() + "\t 进入了");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				demo.setA(20);
				},"线程A");
			th1.start();			
			while(demo.a == 1) {}			
			System.out.println(Thread.currentThread().getName() + " 完成了任务，a的值为：" + demo.a);
		}
}
