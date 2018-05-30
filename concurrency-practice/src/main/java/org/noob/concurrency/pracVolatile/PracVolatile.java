package org.noob.concurrency.pracVolatile;

public class PracVolatile {
    //    public static volatile int i = 0;
    public static volatile int i = 0;

    public static void main(String[] args) {
//        多线程演示
//        testThread();
//状态标记量
//        testVolatileStatus();
    }

    /**
     * 状态标记量
     */
    private static void testVolatileStatus() {
        System.out.println("Thread-2 starting");

        new Thread(new Runnable() {
            @Override
            public void run() {
                i = 1;
                System.out.println("Thread-2: set i==" + i);
            }
        }).start();


        System.out.println("Thread-1 starting");
        new Thread(new Runnable() {
            int count = 0;

            @Override
            public void run() {
                while (i != 1) {
                    System.out.println("Thread-1:i==" + i);
                    count++;
                    System.out.println("Thread-1 execute:" + count + "times");
                }
                System.out.println("Othre Thread set i=:" + i);
            }
        }).start();


        System.out.println("Main Thread End");
    }

    /**
     * 多线程演示
     */
    private static void testThread() {
        //多线程演示
        System.out.println("Thread1 start:");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (; i < 10; ) {
                    i++;
                    System.out.println("Thread1:" + i);
                }
            }
        }).start();

        System.out.println("Thread2 start:");
        new Thread(new Runnable() {
            @Override
            public void run() {
                i++;
                System.out.println("Thread2:" + i);
            }
        }).start();
    }
}
