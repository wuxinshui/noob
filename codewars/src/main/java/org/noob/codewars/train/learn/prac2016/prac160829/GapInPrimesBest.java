package org.noob.codewars.train.learn.prac2016.prac160829;

import java.util.Arrays;

/**
 * Created by FujiRen on 2016/8/30.
 */
public class GapInPrimesBest {

    public static void main(String[] args) {
        int g = 6;
        long m = 100;
        long n = 110;
        System.out.println(Arrays.toString(gap(g, m, n)));
    }

    /**
     * 1.素数的判断;
     * 2.保留前一个素数，现在的素数与前一个素数做比较
     *
     * @param g
     * @param m
     * @param n
     * @return
     */
    public static long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                //一直保留前一个素数
                last = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
