package com.vinh.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadpoolExample {
	public static final int CORE_POOL_SIZE = 5;
	public static final int MAXIMUM_POOL_SIZE = 10;
	public static final int KEEP_ALIVE_TIME = 10;
	
	public static final int ARRAY_BLOCKING_QUEUE_NUMBER_MEMBER = 100;
	public static final int NUMBER_OF_THREAD = 55;

	public static void main(String[] args) {

		ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(ARRAY_BLOCKING_QUEUE_NUMBER_MEMBER);
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE,
				KEEP_ALIVE_TIME, TimeUnit.SECONDS, queue);
		 //corePoolSize__maximumPoolSize__keepAliveTime__unit of keepAliveTime__workQueue
		 

		for (int i = 0; i < NUMBER_OF_THREAD; i++) {
			threadPoolExecutor.execute(new CustomThreadpool(i));
			threadPoolExecutor.execute(new CustomThreadpool2(i));
		}
	}// end of main

}// end of class