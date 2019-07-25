package java8.optional;

import java.util.List;
import java.util.Optional;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/7/25 16:40
 */
public class OpTest {

    public static void main(String[] args) {
        //List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> list = null;
        System.out.println(Optional.ofNullable(list).orElse(List.of(0)));
        System.out.println(Optional.ofNullable(list).orElseGet(() -> List.of(0)));
        System.out.println(Optional.ofNullable(list).orElseThrow(RuntimeException::new));


        System.out.println(Optional.of(list).orElse(List.of(0)));
        System.out.println(Optional.of(list).orElseGet(() -> List.of(0)));
        System.out.println(Optional.of(list).orElseThrow(RuntimeException::new));
    }

}
