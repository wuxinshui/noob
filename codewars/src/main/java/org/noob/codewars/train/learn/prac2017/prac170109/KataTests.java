package org.noob.codewars.train.learn.prac2017.prac170109;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;
import java.util.*;
import java.math.BigInteger;

/**
 * Copyright [2017$] [Wuxinshui]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Created by wuxinshui on 2017/1/9.
 */
public class KataTests {

    @Test
    public void FibDigtis_BasicTest1() {
        int n = 10;
        int[][] expectedResult = new int[][] {
                new int[] {2, 5}};
        int[][] result = Kata.FibDigits(n);
        assertEquals(expectedResult,result);
    }
    @Test
    public void FibDigtis_BasicTest2() {
        int n = 10000;
        int[][] expectedResult = new int[][] {
                new int[] {254, 3},
                new int[] {228, 2},
                new int[] {217, 6},
                new int[] {217, 0},
                new int[] {202, 5},
                new int[] {199, 1},
                new int[] {198, 7},
                new int[] {197, 8},
                new int[] {194, 4},
                new int[] {184, 9}
        };
        int[][] result = Kata.FibDigits(n);
        assertEquals(expectedResult,result);
    }
    @Test
    public void FibDigtis_BasicTest3() {
        int n = 100000;
        int[][] expectedResult = new int[][] {
                new int[] {2149, 2},
                new int[] {2135, 1},
                new int[] {2131, 8},
                new int[] {2118, 9},
                new int[] {2109, 0},
                new int[] {2096, 3},
                new int[] {2053, 5},
                new int[] {2051, 6},
                new int[] {2034, 7},
                new int[] {2023, 4},
        };
        int[][] result = Kata.FibDigits(n);
        assertEquals(expectedResult,result);
    }
    public static int[][] solution(int n)
    {
        BigInteger fibn = new BigInteger("0");
        fibn = fib(n);String s = fibn.toString();
        int[][] res = new int[10][10];int pair_count = 0;
        for(int i = 0; i <= 9; i++) {
            int dig_count = s.split(String.valueOf(i),-1).length-1;
            if(dig_count != 0) {
                res[i] = new int[] {dig_count, i};
                pair_count++;
            }
        }
        Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] res_rev = new int[10][10];
        for(int i = 0; i <= 9; i++) res_rev[i] = res[9-i];
        res_rev = Arrays.copyOf(res_rev, 10-(10-pair_count));
        return res_rev;
    }
    public static BigInteger fib(int n) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            c = a;
            a = b;
            b = b.add(c);
        }
        return a;
    }
    @Test
    public void FibDigtis_RandomTests() {
        for(int i = 0; i < 10; i++) {
            int n =  Math.max(10,(int)Math.floor(Math.random() * 100000));
            int[][] expected = solution(n);
            int[][] actual = Kata.FibDigits(n);
            System.out.println("testing fib " + n);
            System.out.println("result");
            for(int j = 0; j < expected.length; j++) System.out.println(Arrays.toString(actual[j]));
            assertArrayEquals(expected, actual);
        }
    }
}
