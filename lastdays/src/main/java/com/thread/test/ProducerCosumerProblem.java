package com.thread.test;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerCosumerProblem {
	
	private static final int MAX_SIZE = 10;
	private static BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(MAX_SIZE); 
	
	public static void main(String[] args) {
		
		Producer produce = new Producer();
		Consumer consumer = new Consumer();
		produce.start();
		consumer.start();
		
	}

	private static class Producer extends Thread {
		
		@Override
		public void run() {
			Random random = new Random();
			
			while (true) {
				try {
					int value = random.nextInt(MAX_SIZE);
					queue.put(value);
					System.out.println("producing the queue : " + value);
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static class Consumer extends Thread {
		
		@Override
		public void run() {
			while (true) {
				try {
					System.out.println("consuming the queue..." + queue.take());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

