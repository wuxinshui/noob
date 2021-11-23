package org.noob.thinking.lione;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 任意一个偶数（大于2）都可以由2个素数组成，而且组合情况有多种，编程实现输入一个偶数输出两个素数差值最小的素数对 ****
 * 备注：质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数（规定1既不是质数也不是合数）。
 * 举例：输入：10；有2个素数对：3,7 以及 5 5；；；输出：5 - 5 = 0
 */
public class SuShu {

    private static Map<Integer, String> map = new TreeMap<>();

    public static void main(String[] args) {
        int num = 120;
        boolean success = cal(num);
        //输出所有
        if (success) {
            for (Map.Entry set : map.entrySet()) {
                System.out.println("所有符合条件：" + set.getValue());
            }
        }
        //输出第一个
        List<Integer> list = new ArrayList<>(map.keySet());
        int key = list.get(0);

        System.out.println("两个素数差值最小的素数对：" + map.get(key));

    }

    public static boolean cal(int num) {


        if (num < 2 || num % 2 != 0) {
            return false;
        }

        int left = 0;
        int right = num;

        for (; left <= right; left++, right--) {
            if ((num == left + right) && isSuShu(left) && isSuShu(right)) {
                map.put((right - left), right + "-" + left + "=" + (right - left));
            }
        }

        return true;

    }

    private static boolean isSuShu(int num) {
        for (int i = 2; i < num; i++) {
            if (0 == num % i) {
                return false;
            }
        }

        return true;
    }
}
