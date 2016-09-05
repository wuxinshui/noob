package org.noob.codewars.train.learn.prac160901;

/**
 * Created by FujiRen on 2016/9/5.
 * Java 值传递
 * <p>
 * <p>
 * （1）：“在Java里面参数传递都是按值传递”这句话的意思是：按值传递是传递的值的拷贝，按引用传递其实传递的是引用的地址值，所以统称按值传递。
 * （2）：在Java里面只有基本类型和按照下面这种定义方式的String是按值传递，其它的都是按引用传递。就是直接使用双引号定义字符串方式：String str = “Java私塾”;
 * <p>
 */
public class ValuePass {
    public static void main(String[] args) {
        A a = new A();
        a.a = 10;
        changeValue(a);
        System.out.println("Main A.a: " + a.a);
    }

    public static void changeValue(A a) {
        a = new A();
        a.a = 20;
        System.out.println("changValue A.a:" + a.a);
    }
}

class A {
    public int a = 0;
}

