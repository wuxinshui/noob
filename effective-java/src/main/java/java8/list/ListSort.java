package java8.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        // Collections.sort(names, String::compareTo);
        // System.out.println(names);
        // Collections.sort(names,(String a,String b)->a.compareTo(b));
        // names.sort((a,b)->a.compareTo(b));
        // System.out.println(names);
        //
        // names.sort((a, b) -> a.compareTo(b));
        // System.out.println(names);

        names= names.stream().sorted(Comparator.comparing(String::hashCode).reversed()).collect(Collectors.toList());

        System.out.println(names);

    }
}
