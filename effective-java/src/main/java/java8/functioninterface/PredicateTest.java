package java8.functioninterface;

import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/7/3 14:18
 */
public class PredicateTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        eval(list, n -> n > 3);
    }


    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().forEach(o -> {
            if (predicate.test(o)) {
                System.out.println("eval:" + o);
            }
        });
    }
}
