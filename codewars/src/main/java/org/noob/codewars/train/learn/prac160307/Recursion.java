package org.noob.codewars.train.learn.prac160307;

import java.util.Scanner;

/**
 * Created by FujiRen on 2016/9/19.
 * Write a factorial function that takes a positive integer,  as a parameter and prints the result of N! (N factorial).
 */
public class Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(factorial(N));
    }

    private static int factorial(int n){
        if (n==1){
            return n;
        }else{
            return n*factorial(n);
        }
    }
}
