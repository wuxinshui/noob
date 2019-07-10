package java8.stream;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/27 14:36
 */
public class GenerateStream {
    public static void main(String[] args) {
        System.out.println("Stream.of Integer--------------------");
        Stream.of(2).forEach(System.out::println);
        System.out.println("Stream.of Integer String--------------------");
        Stream.of(2, 3, 4, "aa").forEach(System.out::println);
        System.out.println("Stream.of array--------------------");
        String[] array = new String[]{"12", "24"};
        Stream.of(array).forEach(System.out::println);
        System.out.println("Stream.concat--------------------");
        Stream.concat(Stream.of(12), Stream.of(34)).forEach(System.out::println);
        System.out.println("List.of String--------------------");
        List.of("aa", "er").stream().sorted().forEach(System.out::println);
        System.out.println("List.of Integer String--------------------");
        //java.lang.ClassCastException: java.base/java.lang.String cannot be cast to java.base/java.lang.Integer
        //List.of("aa",23,"23","34").java8.stream().sorted().forEach(System.out::println);
        //Exception in thread "main" java.lang.ClassCastException: java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
        //List.of(23,"23","34").java8.stream().sorted().forEach(System.out::println);
        List.of("aa", 23, "23", "34").stream().forEach(System.out::println);
        System.out.println("List.of String Integer--------------------");
        List.of(23, "23", "34").stream().forEach(System.out::println);
        System.out.println("Stream.generate--------------------");
        Random random = new Random();
        Supplier<Integer> supplier = random::nextInt;
        Stream.generate(supplier).limit(5).forEach(System.out::println);
        System.out.println("Stream.iterate--------------------");
        Stream.iterate(0,n->n+3).limit(5).forEach(System.out::println);

    }
}
