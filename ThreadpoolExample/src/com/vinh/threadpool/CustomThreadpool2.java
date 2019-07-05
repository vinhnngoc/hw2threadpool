package com.vinh.threadpool;

public class CustomThreadpool2 implements Runnable {
	int id;
	@Override
	public void run() {
		System.out.println("start thread 2 " + id);
		try {
			Thread.sleep(700);
		} catch (Exception e) {
			System.out.println("error");
		}
		System.out.println("finish thread 2: " + id);
	}
	
	public CustomThreadpool2(int i) {
		this.id = i;
	}
}
