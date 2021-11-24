package org.noob.thinking.tree;

/**
 * 1,1,2,3,5,8,13
 */
public class Fabi {
    public static void main(String[] args) {
        int num = 8;
        Fabi fabi = new Fabi();
        System.out.println(fabi.fib(num));

        for (int i = 0; i <= 10; i++) {
            System.out.println(fabi.fib0(i));
        }

        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
        }
    }

    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }


    public int fib0(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fib0(num - 1) + fib0(num-2);
        }


    }


    /**
     * https://blog.csdn.net/zhanshen112/article/details/84871155
     * <p>
     * 1. 1000000007是一个质数（素数），对质数取余能最大程度避免冲突～
     * 2. int32位的最大值为2147483647，所以对于int32位来说1000000007足够大
     * 3. int64位的最大值为2^63-1，对于1000000007来说它的平方不会在int64中溢出
     *
     * @param num
     * @return
     */
    public int fib(int num) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < num; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }

        return a;

    }


}
