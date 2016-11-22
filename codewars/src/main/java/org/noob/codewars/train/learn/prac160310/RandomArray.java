package org.noob.codewars.train.learn.prac160310;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: FujiRen
 * Date: 2016/11/22
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 * 写一个函数，它的作用是接受一个整数（假设为length），返回一个数组，数组的长度为length，数组中的内容为随机的0至（length－1）的值，并且不能重复。比如length为5的话，数组可能是[1,0,3,2,4]。
 */
public class RandomArray {

    public static void main(String[] args) {
        int length = 10;
        int[] array = RandomArray.random(length);
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i] + "]");
            }
        }
    }


    public static int[] random(int length) {
        if (length <= 0) {
            return new int[length];
        }
        List<Integer> arrayList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(i);
        }
        int[] aray = new int[length];
        for (int i = 0; i < length; i++) {
            aray[i] = arrayList.remove(new Random().nextInt(length - i));
        }
        return aray;
    }
}
