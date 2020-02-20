package java8.localdatetime;

import java.time.*;
import java.util.Date;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2020/1/16 17:24
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        // test1();
        milliLong();
    }

    private static void test1() {
        //打印当前时间
        System.out.println(LocalDateTime.now());
        //当前时间-秒
        long second = LocalDateTime.now().getSecond();
        System.out.println(second);
        //the number of seconds from the epoch of 1970-01-01T00:00:00Z
        long second1 = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        System.out.println("second1 " + second1);
        //Gets the second-of-minute field.
        long sd = LocalDateTime.now().atOffset(ZoneOffset.of("+8")).getSecond();
        System.out.println("getSecond " + sd);
        //the number of seconds from the epoch of 1970-01-01T00:00:00Z
        long sd1 = LocalDateTime.now().atOffset(ZoneOffset.of("+8")).toEpochSecond();
        System.out.println("toEpochSecond " + sd1);
        //毫秒
        long ms = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(ms);
    }

    public static void milliLong() {
        String time = "1573008898000";
        LocalDateTime localDateTime = Instant.ofEpochMilli(Long.valueOf(time)).atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime: " + localDateTime);
        LocalDate localDate = Instant.ofEpochMilli(Long.valueOf(time)).atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("localDate: " + localDate);
        LocalTime localTime = Instant.ofEpochMilli(Long.valueOf(time)).atZone(ZoneId.systemDefault()).toLocalTime();
        System.out.println("localTime: " + localTime);
        Instant instant = Instant.ofEpochMilli(Long.valueOf(time)).atZone(ZoneId.systemDefault()).toInstant();
        System.out.println("instant: " + instant);
        Date date = Date.from(instant);
        System.out.println("date:-" + date);
    }
}
