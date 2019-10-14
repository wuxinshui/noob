package org.noob.codewars.train.niuke;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/10/12 16:31
 */
public class Test {
    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
        //printCharArray();
        System.out.println(tableSizeFor(12));
    }

    private static void printCharArray() {
        int[] st=new int[]{1,2,3};
        System.out.println(st);
        char[] st1=new char[]{'1','2','3'};
        //java.io.PrintStream.println(char[])
        System.out.println(st1);
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
