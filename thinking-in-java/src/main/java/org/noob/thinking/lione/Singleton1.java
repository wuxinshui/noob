package org.noob.thinking.lione;

/**
 * 2、用2种方式 实现 单例
 *
 * https://www.cnblogs.com/Andrew520/p/11484809.html
 */
public class Singleton1 {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance());
    }

    private static volatile Singleton1 instance = null;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (null == instance) {
            // synchronized (lock) {
            synchronized (Singleton1.class) {
                //发生指令重排，导致其他线程拿到的是null。加关键字volatile
                if (null == instance) {
                    return new Singleton1();
                }
            }
        }

        return instance;
    }
}
