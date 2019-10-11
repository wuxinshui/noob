package org.noob.codewars.train.xiaomage.sg20190711;

/**
 * @Author: yoyo
 * @Description: https://www.liugaoyang.xin/2019/07/11/%E5%B0%8F%E9%A9%AC%E5%93%A5%E6%AF%8F%E6%97%A5%E4%B8%80%E9%A2%98/
 * @Date: Created in 2019/10/11 19:03
 */
public class Bleep {
    String name = "Bleep";

    public static void main(String[] args) throws InterruptedException {
        new Bleep().backgroundSetName();
    }

    void setName(String name) {
        this.name = name;
    }

    void backgroundSetName() throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                setName("Blat");
            }
        };
        t.start();
        t.join();
        System.out.println(name);
    }
}
