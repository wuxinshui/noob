package org.noob.thinking.chapter21.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

	public static void main(String[] args) {
		long s=System.currentTimeMillis();
		ExecutorService service=Executors.newFixedThreadPool(6);
		for (int i = 0; i < 50; i++) {
			service.execute(new LiftOff());
		}
		service.shutdown();
		long e=System.currentTimeMillis();
		System.out.println("ssssssssssssssss:"+(e-s));
	}

}
