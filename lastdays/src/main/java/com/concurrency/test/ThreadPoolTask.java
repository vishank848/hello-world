package com.concurrency.test;

public class ThreadPoolTask implements Runnable {

	private int num;

	public ThreadPoolTask(int n) {
		num = n;
	}

	public void run() {
		System.out.println("Task " + num + " is running.");
	}

}
