package org.noob.thinking.lione;

import java.util.concurrent.*;

/**
 * 3、启动4个线程，2个线程对变量i加一，2个线程对变量i减一 ；只要执行一次
 */
public class ThreadTest {
    private final Object lock = new Object();
    public static volatile int i = 10;

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();

        threadTest.add1();
        threadTest.add2();

        System.out.println("启动4个线程，2个线程对变量i加一，2个线程对变量i减一 ；结果：" + i);
    }

    public void add1() {
        try {
            ExecutorService executorService1 = new ThreadPoolExecutor(2, 2,
                    2, TimeUnit.MINUTES, new ArrayBlockingQueue(2));

            CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> add(true), executorService1);

            System.out.println("i++:" + completableFuture.get(2, TimeUnit.SECONDS));

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }


    public void add2() {
        try {
            ExecutorService executorService2 = new ThreadPoolExecutor(2, 2,
                    2, TimeUnit.MINUTES, new ArrayBlockingQueue(2));

            CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> add(false), executorService2);

            System.out.println("i--:" + completableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

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
