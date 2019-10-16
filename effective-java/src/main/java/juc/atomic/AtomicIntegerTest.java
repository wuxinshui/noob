package juc.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    private static AtomicInteger count=new AtomicInteger();


    public static void main(String[] args) {
        test0();
        increment();
        System.out.println(get());
        increment();
        System.out.println(get());
    }

    public static void increment(){
        count.incrementAndGet();
    }

    public static int get(){
        return count.get();
    }

    private static void test0() {
        AtomicInteger atomicInteger=new AtomicInteger();
        System.out.println(atomicInteger.addAndGet(1));
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger.get());
    }
}
