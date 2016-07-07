package org.noob.concurrency.prac1D1;


import net.jcip.annotations.NotThreadSafe;

/**
 * Created by FujiRen on 2016/7/6.
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }

    public static void main(String[] args) {
        UnsafeSequence unsafeSequence = new UnsafeSequence();
        for (int i = 0; i < 100; i++) {
            System.out.println(unsafeSequence.getNext());
        }
    }

}
