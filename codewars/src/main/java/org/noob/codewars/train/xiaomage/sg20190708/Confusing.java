package org.noob.codewars.train.xiaomage.sg20190708;

/**
 * @Author: yoyo
 * @Description: https://segmentfault.com/q/1010000019697419?utm_source=tag-newest
 * <p>
 * 以上程序输出内容是？ (a) Object
 * (b) double array
 * (c) 以上都不是
 * @Date: Created in 2019/10/11 18:43
 */
public class Confusing {
    public Confusing(Object o) {
        System.out.println("Object");
    }

    public Confusing(double[] dArray) {
        System.out.println("double array");
    }

    public static void main(String args[]) {
        new Confusing(null);
    }

}
