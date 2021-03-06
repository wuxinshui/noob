package org.noob.codewars.train.niuke;

/**
 * https://www.nowcoder.com/ta/coding-interviews?query=&asc=true&order=&page=1
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * https://www.nowcoder.com/questionTerminal/7a0da8fc483247ff8800059e12d7caf1?answerType=1&f=discussion
 */
public class Day1 {
    public static void main(String[] args) {
        Day1 day1 = new Day1();
        int k = 4;
        System.out.println(day1.ternaryPlus(k));
        System.out.println(day1.andPlus(k));
    }

    public int ternaryPlus(int n) {
        int sum = n;
        boolean flag = n == 0 ? false : (sum += ternaryPlus(--n)) > 0;
        return sum;
    }

    public int andPlus(int n) {
        int sum = n;
        boolean flag = n > 0 && (sum += ternaryPlus(--n)) > 0;
        return sum;
    }

}
