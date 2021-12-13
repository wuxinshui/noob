package org.noob.concurrency.geektime.concurrent.jmm2;

public class VolatileExample {
    int x = 0;
    volatile boolean v = false;

    public void writer() {
        x = 42;
        v = true;
    }

    public void reader() {
        if (v == true) {
            System.out.println(x);
        } else {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.reader();
        volatileExample.writer();
        volatileExample.reader();
    }
}
