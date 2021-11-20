package org.noob.concurrency.thread;

public class CustomerThread extends Thread {
    @Override
    public void run() {
        System.out.println("this is thread");
        super.run();
    }
}
