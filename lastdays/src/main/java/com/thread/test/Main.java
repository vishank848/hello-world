package com.thread.test;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		workOnThread();

		//workOnFile();

	}

	private static void workOnThread() {
		Thread t1 = new Thread(() -> System.out.println("ds"));
		t1.start();
	}

	private static void workOnFile() {
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new WriteThread("D:\\java-test\\test.txt"));
		t1.start();
		Thread t2 = new Thread(new WriteThread("D:\\java-test\\test1.txt"));
		t2.start();
		Thread t3 = new Thread(new WriteThread("D:\\java-test\\test2.txt"));
		t3.start();
		if (t1.isAlive()) {
			System.out.println(t1.getName() + " thread is working");
		}

		System.out.println("total time = " + (System.currentTimeMillis() - start) + " ms");
	}

}
