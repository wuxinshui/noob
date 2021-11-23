package org.noob.thinking.lione;

/**
 * 3、启动4个线程，2个线程对变量i加一，2个线程对变量i减一 ；只要执行一次
 */
public class ThreadTest1 {
    private final Object lock = new Object();
    public int i = 10;

    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1();
        test1.cal();

        System.out.println("启动4个线程，2个线程对变量i加一，2个线程对变量i减一 ；结果：" + test1.i);
    }

    public void cal() {
        Thread thread1 = new Thread(() -> add(true));
        Thread thread2 = new Thread(() -> add(true));
        Thread thread3 = new Thread(() -> add(false));
        Thread thread4 = new Thread(() -> add(false));
        thread1.run();
        System.out.println("thread1 i++,结果：" + i);
        thread2.run();

        System.out.println("thread2 i++,结果：" + i);
        thread3.run();

        System.out.println("thread3 i--,结果：" + i);
        thread4.run();

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
