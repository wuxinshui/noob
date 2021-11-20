package org.noob.concurrency.thread;

public class MainThread {
    public static void main(String[] args) {
        CustomerThread customerThread = new CustomerThread();
        customerThread.start();

        RunnableThread runnableThread = new RunnableThread();

        Thread thread = new Thread(runnableThread);

        thread.start();

        System.out.println(0x61c88647);
    }


}
