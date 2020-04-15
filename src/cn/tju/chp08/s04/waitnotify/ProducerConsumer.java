package cn.tju.chp08.s04.waitnotify;

public class ProducerConsumer {
	//主程序操作
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		
		ProducerNew pn = new ProducerNew(ss);
		Thread tProducer = new Thread(pn);
		tProducer.start();
		
		ConsumerNew cn = new ConsumerNew(ss);
		Thread tConsumer = new Thread(cn);
		tConsumer.start();
		
	}

}

//生产和消费的对象
class Mantou{
	int id;
	public Mantou(int id) {
		this.id = id;
	}
	public String toString() {
		return "Mantou:" + id;
	}
}


//生产消费的容器
class SyncStack{
	int index = 0;
	Mantou[] arrMT = new Mantou[6];
	
	//增加（生产）
	public synchronized void push(Mantou mt)  {
		while (index == arrMT.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
		
		arrMT[index] = mt;		
		this.notify();
		index++;		
	}
	
	//弹出（消费）
	public synchronized Mantou pop() throws InterruptedException {
		while (index == 0) {
			this.wait();
		}
		this.notify();
		index--;
		
		return arrMT[index];
	}
}

//生产者线程
class ProducerNew implements Runnable{
	SyncStack ss = null;
	public ProducerNew(SyncStack ss) {
		this.ss = ss;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			Mantou mt = new Mantou(i);
			ss.push(mt);
			System.out.println("生产了：" + mt );
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}


//消费者线程
class ConsumerNew implements Runnable{
	SyncStack ss = null;
	public ConsumerNew(SyncStack ss) {
		this.ss = ss;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			Mantou mt;
			try {
				mt = ss.pop();
				System.out.println("消费了：" + mt );
				Thread.sleep((long) (Math.random()*1000));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}