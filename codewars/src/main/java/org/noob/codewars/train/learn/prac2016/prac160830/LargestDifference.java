package org.noob.codewars.train.learn.prac2016.prac160830;

import java.util.Arrays;

/**
 * Created by FujiRen on 2016/8/30.
 */
public class LargestDifference {

    public static void main(String[] args) {
        int[] s = new int[]{9, 4, 1, 10, 3, 4, 0, -1, -2};
//        Arrays.sort(s);
        String string = Arrays.toString(s);
        System.out.println(Arrays.toString(s));
        System.out.println(string.indexOf("10") - string.indexOf("-2"));
    }

    /**
     * Best practice
     *
     * @param data
     * @return
     */
    public static int largestDifference(int[] data) {

        //code here
        int max_diff = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[i] <= data[j]&&j-i>max_diff) {
                    max_diff = j - i;
                }
            }
        }
        return max_diff;

    }
}
