package com.thread.test;

/**
 * 
 * Problem description : -
 * 
 * Step 1: Take input FILE_NAME from user at main thread.
 * 
 * Step 2: Perform 10 operations on that file (i.e count chars, count lines
 * etc.. ), and all those 10 operations must be in separated threads. It means
 * there must be 10 child threads.
 * 
 * Step 3: Main thread waits until all those child threads completed.
 * 
 * Step 4: Print result.
 *
 */
public class ThreadTest {

	// This is object to synchronize on.
	private static final Object waitObject = ThreadTest.class;
	// Your boolean.
	private static boolean boolValue = false;

	public final Result result = new Result();

	public static void main(String[] args) {
		final ThreadTest mytest = new ThreadTest();

		System.out.println("main started");

		new Thread(new Runnable() {

			public void run() {
				System.out.println("Inside thread");

				// Int initialiser
				new Thread(new Runnable() {

					public void run() {
						System.out.println("Setting integer value");
						mytest.result.setIntValue(346635);
						System.out.println("Integer value seted");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}).start();

				// String initialiser
				new Thread(new Runnable() {

					public void run() {
						System.out.println("Setting string value");
						mytest.result.setStringValue("Hello hi");
						System.out.println("String value seted");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}).start();

				// Boolean initialiser
				new Thread(new Runnable() {

					public void run() {
						System.out.println("Setting boolean value");
						mytest.result.setBoolValue(true);
						System.out.println("Boolean value seted");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}).start();

				System.out.println("Thread is finished");

				// Notify to main thread
				synchronized (ThreadTest.waitObject) {
					ThreadTest.boolValue = true;
					ThreadTest.waitObject.notifyAll();
				}
			}
		}).start();

		try {
			synchronized (ThreadTest.waitObject) {
				while (!ThreadTest.boolValue) {
					ThreadTest.waitObject.wait();
				}
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("main finished");
		System.out.println("Result is : " + mytest.result.toString());
	}

}
