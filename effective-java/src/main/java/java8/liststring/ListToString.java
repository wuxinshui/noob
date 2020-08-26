package java8.liststring;

import org.springframework.util.StringUtils;

import java.util.List;

public class ListToString {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> list1 = List.of(1);


        System.out.println(StringUtils.arrayToDelimitedString(list.toArray(), ","));
        System.out.println(StringUtils.arrayToCommaDelimitedString(list.toArray()));
        System.out.println("=====================================================");
        System.out.println(StringUtils.arrayToDelimitedString(list1.toArray(), ","));
        System.out.println(StringUtils.arrayToCommaDelimitedString(list1.toArray()));
    }
}
