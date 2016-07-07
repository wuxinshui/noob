package org.noob.thinking.chapter21.thread;

public class ThreadPractice1 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("#Thread " + i + "start");
			Thread.yield();
		}

	}

	public static void main(String[] args) {

	}

}
