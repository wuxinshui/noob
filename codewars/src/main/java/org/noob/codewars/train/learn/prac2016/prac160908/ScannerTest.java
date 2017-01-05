package org.noob.codewars.train.learn.prac2016.prac160908;

import java.util.Scanner;

/**
 * Created by FujiRen on 2016/9/9.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 创建对象
        Scanner sc = new Scanner(System.in);

        // 获取两个int类型的值
//        System.out.println("获取两个int类型的值:");
//        int a1 = sc.nextInt();
//        int b1 = sc.nextInt();
//        System.out.println("a1:" + a1 + ",b1:" + b1);
//        System.out.println("-------------------");

        // 获取两个String类型的值
//        System.out.println("获取两个String类型的值:");
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        System.out.println("s1:" + s1 + ",s2:" + s2);
//        System.out.println("-------------------");

        // 先获取一个字符串，在获取一个int值
//        System.out.println("先获取一个字符串，在获取一个int值");
//        String s3 = sc.nextLine();
//        int b3 = sc.nextInt();
//        System.out.println("s3:" + s3 + ",b3:" + b3);
//        System.out.println("-------------------");

        // 先获取一个int值，在获取一个字符串
//        System.out.println("先获取一个int值，在获取一个字符串");
//        int a4 = sc.nextInt();
//        String s4 = sc.nextLine();
//        System.out.println("a4:" + a4 + ",s4:" + s4);
//        System.out.println("-------------------");

        int a = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        String s = sc2.nextLine();
        System.out.println("a:" + a + ",s:" + s);
    }
}
