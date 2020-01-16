package java8.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2020/1/16 17:24
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        //    获取秒
        long second = LocalDateTime.now().getSecond();
        System.out.println(second);
        long second1 = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        System.out.println("second1 "+second1);
        long sd = LocalDateTime.now().atOffset(ZoneOffset.of("+8")).getSecond();
        System.out.println("getSecond "+sd);
        long sd1 = LocalDateTime.now().atOffset(ZoneOffset.of("+8")).toEpochSecond();
        System.out.println("toEpochSecond "+sd1);
        //    毫秒
        long ms = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(ms);
    }
}
