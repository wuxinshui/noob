package stream;

import java.util.stream.Stream;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/27 14:36
 */
public class GenerateStream {
    public static void main(String[] args) {
        Stream.of(2).forEach(System.out::println);
        Stream.of(2,3,4,"aa").forEach(System.out::println);
    }
}
