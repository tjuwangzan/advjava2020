package cn.tju.chp08.s08.stopthread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class VolatileStop2 {
	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue container = new ArrayBlockingQueue(10);
		Producer producer = new Producer(container);
		Thread producerThread = new Thread(producer);
		producerThread.start();
		Thread.sleep(1000);
		
		Consumer consumer = new Consumer(container);
		while(consumer.needMoreNums()) {
			System.out.println(consumer.container.take() + "被消费了");
			Thread.sleep(100);
		}
		System.out.println("消费者不需要更多数据了");
		producer.exit = true;
		System.out.println(producer.exit);
	}

}

class Producer implements Runnable{
	public volatile boolean exit = false;
	BlockingQueue container;
	
	public Producer(BlockingQueue container) {
		this.container = container;
	}

	@Override
	public void run() {
		int count = 0;
		long starttime = System.currentTimeMillis();
		try {
			while(count <=100000 && !exit) {
				if (count%100==0) {
					container.put(count);
					System.out.println(count + "是100的倍数,被放到仓库了");
				}
				count++;
				
			}
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		} finally {
			System.out.println("生产者结束运行");
		}
	}
	
}


class Consumer {
	public volatile boolean exit = false;
	BlockingQueue container;
	
	public Consumer(BlockingQueue container) {
		this.container = container;
	}
	
	public boolean needMoreNums() {
		if (Math.random() > 0.95 ) {
			return false;
		}
		return true;
	}	
}
