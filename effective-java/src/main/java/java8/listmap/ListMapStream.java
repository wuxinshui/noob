package java8.listmap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListMapStream {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("2", 2, "1", 2, "3", 3);
        Map<String, Integer> map2 = Map.of("2", 2, "1", 2, "3", 3);

        List<Map<String, Integer>> list = List.of(map1, map2);

        //    求和
        Long sum = list.parallelStream().map(map -> map.values().parallelStream().collect(Collectors.toList())).flatMap(List::stream).collect(Collectors.summarizingInt(x -> x)).getSum();
        System.out.println(sum);
        Long sum1 = list.parallelStream().map(map -> map.values().parallelStream().collect(Collectors.summarizingInt(x->x)).getSum()).collect(Collectors.summarizingLong(x -> x)).getSum();
        System.out.println(sum1);
    }
}
