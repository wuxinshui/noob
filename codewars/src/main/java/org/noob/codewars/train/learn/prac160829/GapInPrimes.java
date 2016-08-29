package org.noob.codewars.train.learn.prac160829;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by FujiRen on 2016/8/29.
 * Examples:
 * <p>
 * gap(2, 5, 7) --> [5, 7] or (5, 7) or {5, 7}
 * <p>
 * gap(2, 5, 5) --> nil or in C++ {0, 0}
 * <p>
 * gap(4, 130, 200) --> [163, 167] or (163, 167) or {163, 167}
 * <p>
 * ([193, 197] is also such a 4-gap primes between 130 and 200 but it's not the first pair)
 */
public class GapInPrimes {

    public static void main(String[] args) {
        int g = 6;
        long m = 100;
        long n = 110;
        System.out.println(Arrays.toString(gap(g, m, n)));
    }


    public static long[] gap(int g, long m, long n) {
        // your code
        long[] result = new long[2];
        List<Long> primesList = getPrimes(m, n);
        if (null != primesList && primesList.size() > 0) {
            for (int i = 0; i < primesList.size()-1; i++) {
                Long gap = primesList.get(i+1) - primesList.get(i);
                if (gap.intValue() == g) {
                    result[0] = primesList.get(i);
                    result[1] = primesList.get(i+1);
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * 获取m-n的素数
     *
     * @param m
     * @param n
     * @return
     */
    public static List<Long> getPrimes(long m, long n) {
        List<Long> list = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            if (isPrimes(i)) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * 判断是否是素数
     *
     * @param p
     * @return
     */
    public static boolean isPrimes(long p) {
        for (int i = 2; i <= (p / 2); i++) {
            if (0 == (p% i)) {
                 return false;
            }
        }
        return true;
    }
}
