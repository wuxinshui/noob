package lock.reentrantReadWriteLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/7/18 16:11
 */
public class ReentrantReadWriteLocker {
    private Lock lock = new ReentrantLock();

    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private Lock readLock = readWriteLock.readLock();
    private Lock writeLock = readWriteLock.writeLock();
    private int value = 0;

    public static void main(String[] args) {
        ReentrantReadWriteLocker locker = new ReentrantReadWriteLocker();

        Runnable readRunnable = () -> {
            try {
                locker.handlerRead(locker.lock);
                //locker.handlerRead(locker.readLock);
                System.out.println(Thread.currentThread() + "---------- read value:" + locker.value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable writeRunnable = () -> {
            try {
                //locker.handlerWrite(locker.writeLock, new Random().nextInt());
                locker.handlerWrite(locker.lock, new Random().nextInt());
                System.out.println(Thread.currentThread() + "---------- read value:" + locker.value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        System.out.println("start read....");
        for (int i = 0; i < 10; i++) {
            System.out.println("start read.... no:" + i);
            new Thread(readRunnable).start();
        }

        System.out.println("start write....");
        for (int i = 0; i < 10; i++) {
            System.out.println("start write.... no:" + i);
            new Thread(writeRunnable).start();
        }
    }

    public int handlerRead(Lock lock) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1);
            return value;
        } finally {
            lock.unlock();
        }
    }

    public void handlerWrite(Lock lock, int index) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1);
            value = index;
        } finally {
            lock.unlock();
        }
    }
}
