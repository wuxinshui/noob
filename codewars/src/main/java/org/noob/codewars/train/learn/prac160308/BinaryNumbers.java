package org.noob.codewars.train.learn.prac160308;

import java.util.Scanner;

/**
 * Task
 * Given a base-10 integer,n ,
 * convert it to binary (base-2). Then find and print the base-10 integer
 * denoting the maximum number of consecutive 1's in n's binary representation.
 */
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binaryStr = Integer.toBinaryString(n);
        char[] charStr = binaryStr.toCharArray();
        int count = 1;
        for (int i = 0; i < charStr.length - 1; i++) {
            if ('1' == charStr[i] && '1' == charStr[i + 1]) {
                count++;
            }
        }
        System.out.println(Integer.toBinaryString(n));
        System.out.println(count);
    }
}
