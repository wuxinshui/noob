package org.noob.concurrency.atomic;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongTest {
    private static AtomicLong count = new AtomicLong(0);

    public static void main(String[] args) {
        AtomicLongTest test = new AtomicLongTest();
        test.add();
        test.addAdd();
    }

    public void add() {
        count.set(0);

        int idx = 0;
        while (idx++ < 100) {
            count.getAndIncrement();
        }
        System.out.println(count);
    }

    public void addAdd() {
        count.set(0);

        int idx = 0;
        while (++idx < 100) {
            count.getAndIncrement();
        }
        System.out.println(count);
    }
}
