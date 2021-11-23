package org.noob.thinking.lione;

import java.util.concurrent.*;

/**
 * 3、启动4个线程，2个线程对变量i加一，2个线程对变量i减一 ；只要执行一次
 */
public class ThreadTest2 {
    private final Object lock = new Object();
    public int i = 10;

    public static void main(String[] args) {
        ThreadTest2 test1 = new ThreadTest2();
        // test1.cal();
        test1.cal12();

        System.out.println("启动4个线程，2个线程对变量i加一，2个线程对变量i减一 ；结果：" + test1.i);
    }

    public void cal12() {

        ExecutorService executor = new ThreadPoolExecutor(4, 4, 4, TimeUnit.SECONDS, new LinkedBlockingDeque<>(4));

        FutureTask task1 = new FutureTask(() -> {
            add(true);
            System.out.println("task1 add result:" + i);
            return i;
        });
        FutureTask task2 = new FutureTask(() -> {
            add(true);
            System.out.println("task2 add result:" + i);
            return i;
        });
        FutureTask task3 = new FutureTask(() -> {
            add(false);
            System.out.println("task3 add result:" + i);
            return i;
        });
        FutureTask task4 = new FutureTask(() -> {
            add(false);
            System.out.println("task4 add result:" + i);
            return i;
        });


        executor.submit(task1);
        // System.out.println("thread1 i++,结果：" + i);
        executor.submit(task2);

        // System.out.println("thread2 i++,结果：" + i);
        executor.submit(task3);

        // System.out.println("thread3 i--,结果：" + i);
        executor.submit(task4);

        // System.out.println("thread4 i--,结果：" + i);

        executor.shutdown();
    }


    public void cal() {

        FutureTask task1 = new FutureTask(() -> add(true));
        FutureTask task2 = new FutureTask(() -> add(true));
        FutureTask task3 = new FutureTask(() -> add(false));
        FutureTask task4 = new FutureTask(() -> add(false));

        task1.run();
        System.out.println("thread1 i++,结果：" + i);
        task2.run();

        System.out.println("thread2 i++,结果：" + i);
        task3.run();

        System.out.println("thread3 i--,结果：" + i);
        task4.run();

        System.out.println("thread4 i--,结果：" + i);

    }


    public int add(boolean flag) {
        synchronized (lock) {
            if (flag) {
                return i++;
            } else {
                return i--;
            }
        }
    }


}
