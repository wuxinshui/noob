package org.noob.codewars.train.learn.prac2016.prac160830;

import junit.framework.TestCase;

/**
 * Created by FujiRen on 2016/8/30.
 */
public class TestClass extends TestCase {
    public void test1() {
        assertEquals(4, LargestDifference.largestDifference(new int[]{9, 4, 1, 10, 3, 4, 0, -1, -2}));
    }

    public void test2() {
        assertEquals(0, LargestDifference.largestDifference(new int[]{3, 2, 1}));
    }
}
