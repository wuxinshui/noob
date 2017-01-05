package org.noob.codewars.train.learn.prac2016.prac160908;

import java.util.Scanner;

/**
 * Created by FujiRen on 2016/9/8.
 */
public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
         /* Declare second integer, double, and String variables. */
        int inputI = 0;
        double inputD = 0;
        StringBuilder inputStr = new StringBuilder();
        /* Read and save an integer, double, and String to your variables.*/
        inputI = scan.nextInt();
        inputD = scan.nextDouble();
        //Scanner 使用分隔符模式将其输入分解为标记，默认情况下该分隔符模式与空白匹配
        //将此扫描器的分隔模式设置为指定模式。

        String string = scan.nextLine();
        if ("".equals(string)) {
            string = scan.nextLine();
            inputStr.append(string);
        }
//        while (scan.hasNextLine()) {
//            System.out.println(string);
//            inputStr.append(string);
//            System.out.println(inputStr);
//        }
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + inputI);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + inputD);
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.print(s);
        System.out.print(inputStr);
        scan.close();
    }
}
