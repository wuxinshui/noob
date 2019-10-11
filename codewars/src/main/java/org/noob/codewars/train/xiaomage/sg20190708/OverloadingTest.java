package org.noob.codewars.train.xiaomage.sg20190708;

/**
 * @Author: yoyo
 * @Description: 这个问题我们可能有疑问的是最后两个输出结果，
 * 毕竟我们会说test里面的表达式的结果一定是null啊，
 * 为什么输出结果不同，问题的关键在于计算机并不是什么都知道的，
 * 在编译时，计算机并不知道此表达式的执行结果，
 * 在A中的表达式中，结果可能有两个类型，
 * 即null和object而在B中的表达式中只可能有一种类型即为null.
 * 因此在编译时A中会选择更为特殊的Object进行编译。
 * @Date: Created in 2019/10/11 18:52
 * <p>
 * https://www.liugaoyang.xin/2019/07/11/%E5%B0%8F%E9%A9%AC%E5%93%A5%E6%AF%8F%E6%97%A5%E4%B8%80%E9%A2%98/
 */
public class OverloadingTest {
    public static void test(Object obj) {
        System.out.println("Object called");
    }

    public static void test(String obj) {
        System.out.println("String called");
    }

    public static void main(String[] args) {
        test(null);
        System.out.println("10%2==0 is " + (10 % 2 == 0));
        //A
        test((10 % 2 == 0) ? null : new Object());
        //B
        test((10 % 2 == 0) ? null : null);
    }
}
