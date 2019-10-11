package org.noob.codewars.train.xiaomage.sg20190709;

/**
 * https://segmentfault.com/q/1010000019707127?utm_source=tag-newest
 * <p>
 * 以上程序输出内容是？
 * <p>
 * (a) 100
 * (b) 101
 * (c) 以上都不是
 * (d) 99
 */
public class Loopy {
    public static void main(String[] args) {
        final int start=Integer.MAX_VALUE-100;
        final int end=Integer.MAX_VALUE;
        int count=0;

        //Condition 'i<=end' is always 'true
        for (int i=start;i<=end;i++){
        //for (int i=start;i<end;i++){
            System.out.println(i);
            count++;
        }

        System.out.println(count);
    }
}
