package org.noob.thinking.lione;

/**
 * 2、用2种方式 实现 单例
 *
 * https://www.cnblogs.com/Andrew520/p/11484809.html
 */
public class Singleton2 {
    private final static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {

        return instance;
    }
}
