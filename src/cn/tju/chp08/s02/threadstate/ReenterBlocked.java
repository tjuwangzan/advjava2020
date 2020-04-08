package cn.tju.chp08.s02.threadstate;

public class ReenterBlocked {

	public static void main(String[] args) throws Exception {
		Account account = new Account();
	    
	    Thread withdrawThread = new Thread(new Runnable() {
	        public void run() {
	            account.withdraw(200);
	        }
	    }, "取钱线程");
	    withdrawThread.start();	    
	    Thread.sleep(100); // 确保取钱线程已经得到执行	    
	    System.out.println("1.取钱线程的状态："+withdrawThread.getState());
	    
	    Thread depositThread = new Thread(new Runnable() {
	        public void run() {
	            account.deposit(100);
	        }
	    }, "存钱线程");
	    
	    Thread.sleep(1000); // 让取钱线程等待一段时间
	    depositThread.start();

	    Thread.sleep(300); // 确保取钱线程已经被存钱线程所通知到

	   System.out.println("2.取钱线程的状态："+ withdrawThread.getState());

	}

}

class Account {
    int amount = 100; // 账户初始100元
    public synchronized void deposit(int cash) { // 存钱
        amount += cash;
        notify();
        try {
            Thread.sleep(3000); // 通知后却暂时不退出
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void withdraw(int cash) { // 取钱
        while (cash > amount) {
            try {
                wait();
                System.out.println("3.wait之后的状态" + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        amount -= cash;
    }
}