package java8.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, String::compareTo);
        System.out.println(names);
        Collections.sort(names,(String a,String b)->a.compareTo(b));
        names.sort((a,b)->a.compareTo(b));
        System.out.println(names);

        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);

    }
}
