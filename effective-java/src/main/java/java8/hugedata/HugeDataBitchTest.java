package java8.hugedata;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 大量数据批次处理
 */
public class HugeDataBitchTest {

    public static final int BATCH_DATA = 100;

    public static void main(String[] args) {

        List<Integer> hugeData = Stream.iterate(0, i -> i + 1).limit(200).collect(Collectors.toList());

        List<Integer> subList = null;

        for (int from = 0, to = 0, size = hugeData.size(); from < size; from = to) {
            to = Math.min(from + BATCH_DATA, size);
            subList = hugeData.subList(from, to);
            subCall(subList);
        }

    }

    private static void subCall(List<Integer> integers) {
        System.out.println("-----------------------------");
        integers.stream().forEach(System.out::print);
    }
}
