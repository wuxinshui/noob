package org.noob.codewars.train.xiaomage.sg20190708;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/10/11 18:48
 */
public class ConfusingTest {
    public ConfusingTest(ConfusingParent parent) {
        System.out.println("parent");
    }

    public ConfusingTest(ConfusingChild1 child1) {
        System.out.println("child1");
    }

    public static void main(String[] args) {
        new ConfusingTest(null);
    }
}
