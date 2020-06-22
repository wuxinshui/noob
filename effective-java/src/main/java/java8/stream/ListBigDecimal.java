package java8.stream;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/8/16 13:59
 */
public class ListBigDecimal {
    public static void main(String[] args) {
        List<BigDecimal> ls = List.of(BigDecimal.valueOf(12), BigDecimal.valueOf(12), BigDecimal.valueOf(12));
        // Here is a way to do it with only Java 8 and streams:
        BigDecimal sum = ls.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(sum);
    }
}
