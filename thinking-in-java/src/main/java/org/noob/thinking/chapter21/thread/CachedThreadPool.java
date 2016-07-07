package org.noob.thinking.chapter21.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	public static void main(String[] args) {
		long s=System.currentTimeMillis();
		ExecutorService executor=Executors.newCachedThreadPool();
		for (int i = 0; i <50; i++) {
			executor.execute(new LiftOff());
		}
		executor.shutdown();
		long e=System.currentTimeMillis();
		System.out.println("ssssssssssssssss:"+(e-s));
	}
}
