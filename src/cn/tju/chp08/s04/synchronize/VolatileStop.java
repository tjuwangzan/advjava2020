package cn.tju.chp08.s04.synchronize;

public class VolatileStop  extends Thread{

	    public volatile boolean exit = false;

	    public void run() {
	        while (!exit) {
	            System.out.println("running!");
	        }
	    }

	    public static void main(String[] args) throws Exception {
	    	VolatileStop thread = new VolatileStop();
	        thread.start();
	        Thread.sleep(1000);
	        thread.exit = true;  // 终止线程thread 
	        thread.join();
	        System.out.println("线程退出!");
	    }

}
