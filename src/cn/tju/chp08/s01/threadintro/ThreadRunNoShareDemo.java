package cn.tju.chp08.s01.threadintro;

class Ticket extends Thread{
	private int ticket = 10;
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (ticket > 0) {
				System.out.println("线程名：" + this.getName() + "  Ticket = " + this.ticket--);
			}
		}
	}
	
}

public class ThreadRunNoShareDemo {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
