package cn.tju.chp08.s04.synchronize;
/*
 * Dirty Read
 */
public class BalanceDemo {
	private String name;
	private double balance;
	
	public  void set(String name, double balance) {
		this.name = name;
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	public  double getBalance(String name) {
		return this.balance;
	}
	
	public static void main(String[] args) throws Exception {
		BalanceDemo bd = new BalanceDemo();
		Thread t1 = new Thread(()->bd.set("John", 200),"t1");
		t1.start();
		
//		Thread.sleep(1000);
		System.out.println(bd.getBalance("John"));
		
//		Thread.sleep(2000);
		System.out.println(bd.getBalance("John"));
		
		
	}

}
