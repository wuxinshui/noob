package org.noob.codewars.train.learn.prac2017.prac170109;

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

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuxinshui on 2017/1/9.
 */
public class Kata {
    public static String fib(int n){
        if (n<2){
            return BigInteger.valueOf(n).toString();
        }

        BigInteger num=BigInteger.valueOf(1);
        BigInteger prev=BigInteger.valueOf(1);
        for (int i=3;i<=n;i++){
            BigInteger temp=num;
            num=num.add(prev);
            prev=temp;
        }
        return num.toString();
    }

    public static int[][] FibDigits(int n){
        HashMap<Character,Integer> counts=new HashMap<>();
        String fibo=fib(n);
        for (char c:fibo.toCharArray()){
            counts.put(c,1+counts.getOrDefault(c,0));
        }
        int[][] arr=new int[counts.size()][2];
        int ind=0;
        for (Map.Entry<Character,Integer> mapEntry:counts.entrySet()){
            arr[ind][1]=Character.digit(mapEntry.getKey(),0);
            arr[ind][0]=mapEntry.getValue();
        }
        Arrays.sort(arr,(a,b)->(b[0]-a[0])==0? b[1] - a[1] : b[0] - a[0]);
        return new int[1][1];
    }
}
