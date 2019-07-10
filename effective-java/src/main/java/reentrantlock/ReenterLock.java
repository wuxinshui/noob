package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 重入锁 reentrantLock
 */
public class ReenterLock implements Runnable {
    private static ReentrantLock lock = new ReentrantLock();
    private static int i = 0;

    public ReenterLock(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            lock.lock();
            try {
                i++;
            } finally {
                lock.unlock();
            }
        }
//        System.out.println(Thread.currentThread().getId() + ":" + i);
    }

    public static void main(String[] args) throws InterruptedException {



//        ReenterLock lock = new ReenterLock();
//        Thread thread1 = new Thread(lock);
//        Thread thread2 = new Thread(lock);
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println(i);
        ReentrantLock reentrantLock=new ReentrantLock();
        ReenterLock lock1 = new ReenterLock(reentrantLock);
        ReenterLock lock2 = new ReenterLock(reentrantLock);
        Thread thread1 = new Thread(lock1);
        Thread thread2 = new Thread(lock2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);
    }
}
