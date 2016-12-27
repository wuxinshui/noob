package org.noob.codewars.train.learn.prac161226;

/**
 * Copyright [2016$] [Wuxinshui]
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wuxinshui on 2016/12/26.
 */
public class Emirps {
    public static void main(String[] args) {
//        Long i = 23l;
//        System.out.println(Long.reverse(i));
        System.out.println(Arrays.toString(findEmirp(50)));
    }

    public static long[] findEmirp(long n) {
        long size = 0;
        long max = 0;
        long sum = 0;
        List<Long> list = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            long reverseL = reverse(i);
            //判断不是回文数
            if (i == reverseL) {
                continue;
            }
            //判断反转后的数字位数 10-01
            if (String.valueOf(i).length() != String.valueOf(reverseL).length()) {
                continue;
            }
            //1.判断是否是素数
            //2.判断反转以后也是素数
            if (isPrimeNum(i) && isPrimeNum(reverseL)) {
                list.add(i);
            }
        }
        if (null != list && !list.isEmpty()) {
            size = list.size();
            //4.求出最大值
            Long[] array = list.toArray(new Long[list.size()]);
            sort(array);
            max = array[array.length - 1];
            //5.求所有素数的和
            sum = sum(array);
        }
        return new long[]{size, max, sum};
    }

    /**
     * 数字反转
     *
     * @param l
     * @return
     */
    public static long reverse(long l) {
        StringBuffer str = new StringBuffer(String.valueOf(l));
        str = str.reverse();
        return Long.parseLong(str.toString());
    }

    /**
     * sort
     *
     * @param n
     */
    public static void sort(Long[] n) {
        Arrays.sort(n);
    }

    /**
     * 判断是否是素数
     *
     * @param l
     * @return
     */
    public static boolean isPrimeNum(long l) {
        //默认是素数
        double half = Math.floor(l / 2);
        for (int i = 2; i <= half; i++) {
            if (0 == (l % i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 求数组的和
     *
     * @param n
     * @return
     */
    public static Long sum(Long[] n) {
        Long sumL = 0l;
        for (Long l : n) {
            sumL = l + sumL;
        }
        return sumL;
    }
}
