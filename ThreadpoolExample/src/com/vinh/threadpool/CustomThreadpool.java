package com.vinh.threadpool;

public class CustomThreadpool implements Runnable {
	int id;
	@Override
	public void run() {
		System.out.println("start 1 " + id);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("error");
		}
		System.out.println("finish 1: " + id);
	}
	
	public CustomThreadpool(int i) {
		this.id = i;
	}
}