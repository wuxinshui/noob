package org.noob.codewars.train.learn.prac2016.prac160308;

import java.util.*;

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
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <charStr.length ; i++) {
            if ('1'==charStr[i]){

            }
        }

        System.out.println(Integer.toBinaryString(n));
    }
}
