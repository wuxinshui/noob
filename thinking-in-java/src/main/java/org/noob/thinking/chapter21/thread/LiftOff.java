package org.noob.thinking.chapter21.thread;

public class LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "),";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(status());
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		// new LiftOff(10).run();
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(new LiftOff());
			thread.start();
			System.out.println("Waiting for LiftOff :"+i);
		}

	}
}
