package cn.tju.chp08.s05.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		final ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 60, 
				TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5),Executors.defaultThreadFactory());
		
	}

}
