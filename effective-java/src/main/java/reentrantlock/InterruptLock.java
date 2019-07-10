package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class InterruptLock implements Runnable {
    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();

    private static int i = 0;

    public InterruptLock(int i) {
        i = i;
    }

    @Override
    public void run() {
        if (i == 1) {
            try {
                System.out.println(Thread.currentThread() + "ready to get lock1");
                lock1.lockInterruptibly();
                System.out.println(Thread.currentThread() + "get lock1");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                System.out.println(Thread.currentThread() + "ready to get lock2");
                lock2.lockInterruptibly();
                System.out.println(Thread.currentThread() + "get lock2");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {

            try {
                System.out.println(Thread.currentThread() + "ready to get lock2");
                lock2.lockInterruptibly();
                System.out.println(Thread.currentThread() + "get lock2");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                System.out.println(Thread.currentThread() + "ready to get lock1");
                lock1.lockInterruptibly();
                System.out.println(Thread.currentThread() + "get lock1");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptLock interruptLock = new InterruptLock(1);
        Thread thread1 = new Thread(interruptLock);
        InterruptLock interruptLock2 = new InterruptLock(2);
        Thread thread2 = new Thread(interruptLock2);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        thread1.interrupt();
    }
}
