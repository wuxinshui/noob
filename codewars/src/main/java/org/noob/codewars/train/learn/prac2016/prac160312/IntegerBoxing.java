package org.noob.codewars.train.learn.prac2016.prac160312;

/**
 * Created with IntelliJ IDEA.
 * User: FujiRen
 * Date: 2016/11/23
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 * 基本数据类型的自动装箱(autoboxing)、拆箱(unboxing)是自J2SE 5.0开始提供的功能。
 * 自动拆箱(unboxing)，也就是将对象中的基本数据从对象中自动取出。
 */
public class IntegerBoxing {
    public static void main(String[] args) {
        //在-128~127 之外的数
        Integer i1 = 200;//装箱,实际执行Integer.valueOf(200);
        int t = i1; //拆箱，实际上执行了 int t = i1.intValue();
        Integer i2 = 200;
        //equals() 比较的是两个对象的值（内容）是否相同。
        //"==" 比较的是两个对象的引用（内存地址）是否相同，也用来比较两个基本数据类型的变量值是否相等。
        System.out.println("t==i1 " + (t == i1));
        System.out.println("i1==i2 " + (i1 == i2));
        // 在-128~127 之内的数
        Integer i3 = 100;
        Integer i4 = 100;
        System.out.println("i3==i4 " + (i3 == i4));

    }
}
