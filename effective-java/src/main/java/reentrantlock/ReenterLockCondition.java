package reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterLockCondition implements Runnable {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("locking...");
            condition.await();
            System.out.println("going on...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLockCondition reenterLockCondition=new ReenterLockCondition();

        Thread thread=new Thread(reenterLockCondition);
        thread.start();

        Thread.sleep(1000);

        lock.lock();
        System.out.println("condition get lock...");
        condition.signal();
        System.out.println("condition send signal...");
        lock.unlock();
        System.out.println("release lock");

    }
}
