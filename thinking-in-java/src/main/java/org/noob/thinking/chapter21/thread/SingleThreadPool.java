package org.noob.thinking.chapter21.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {

	public static void main(String[] args) {
		ExecutorService service=Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			service.execute(new LiftOff());
		}
		service.shutdown();
	}

}
