package org.noob.codewars.train.learn.prac2016.prac161121;

/**
 * Created with IntelliJ IDEA.
 * User: FujiRen
 * Date: 2016/11/21
 * Time: 18:14
 * To change this template use File | Settings | File Templates.
 *
 *
 */
public class MyBook extends Book {
    int price;

    /*

    子父类中的构造函数

    在对子类对象进行初始化时，父类的构造函数也会运行
    那是因为子类的构造函数默认的第一行有一句隐式的语句super()

    super()：会访问父类中空参数的构造函数，而且子类中所有的构造函数默认的第一行都是super()

    为什么子类一定要访问父类中的构造函数？
    因为父类中的数据子类可以直接获取，所以子类对象在建立时=，需要查看父类是如何对这些数据进行初始化的
    所以子类在对象进行初始化是要先访问下父类的构造函数
    如果要访问父类中指定的构造函数，可以通过手动定义super语句的方式来指定

    注意：super语句一定是在子类构造函数的第一行

    子类的示例化过程

    结论：
    子类的所有的构造函数，默认都会访问父类中空参数的构造函数
    因为子类每一个构造函函数内的第一行都有一句隐式的super

    当父类中没有空参数的构造函数时候，子类必须手动通过super语句形式来访问父类中指定的构造函数
    当然：子类中的构造函数第一行也可以手动的指定this语句来访问本类中的构造函数
    子类中至少也会有一个构造函数会访问父类中的构造函数
    */
    MyBook(String t, String a,int i) {
        super(t, a);
        price=i;
    }

    @Override
    void display() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
