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
        List<Long> list = new ArrayList<>();
        int sum=0;
        int count=0;
        long max=0;
        for (long i = 0; i < n; i++) {
            long reverseL = reverse(i);
            //判断不是回文数
            if (i == reverseL) {
                continue;
            }
            //判断反转后的数字位数 10-01
            if (i!=reverse(reverseL)) {
                continue;
            }
            //1.判断是否是素数
            //2.判断反转以后也是素数
            if (isPrimeNum(i) && isPrimeNum(reverseL)) {
                sum+=i;
                count++;
                if (i>=max){
                    max=i;
                }
            }
        }
        if (0!=sum&&0!=max) {
            return new long[]{count,max,sum};
        }
        return new long[]{0, 0, 0};
    }

    /**
     * 数字反转
     *
     * @param l
     * @return
     */
    public static long reverse(long l) {
        StringBuilder str = new StringBuilder();
        str =  str.append(l).reverse();
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
