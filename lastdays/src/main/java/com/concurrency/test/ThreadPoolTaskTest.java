package com.concurrency.test;

public class ThreadPoolTaskTest {

	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool(7);

		for (int i = 0; i < 5; i++) {
			ThreadPoolTask threadPoolTask = new ThreadPoolTask(i);
			pool.execute(threadPoolTask);
		}

	}
}
