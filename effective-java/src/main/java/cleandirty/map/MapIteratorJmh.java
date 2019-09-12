package cleandirty.map;

import org.junit.Before;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Author: yoyo
 * @Description: 遍历map集合
 * @Date: Created in 2019/9/12 10:29
 */
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 3)
@Measurement(iterations = 10, time = 5, timeUnit = TimeUnit.SECONDS)
@Threads(8)
@Fork(2)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class MapIteratorJmh {
    public static final String path = "D:\\git\\github\\noob\\effective-java\\src\\main\\java\\cleandirty\\map";
    private Map<String, Integer> map = Map.of();

    public static void main(String[] args) throws RunnerException {
        System.out.println("map iterator jmh test start......");
        Options options = new OptionsBuilder().include(MapIteratorJmh.class.getSimpleName()).output(path).build();
        new Runner(options).run();
    }

    @Before
    public void before() {
        Random random = new Random(100);
        Supplier<Integer> supplier = random::nextInt;
        Stream.generate(supplier).limit(1000).forEach(o -> {
            map.put(String.valueOf(o), o);
        });
    }


    @Benchmark
    public void keysIterator() {
        System.out.println("map iterator by keys");
        map.keySet().stream().forEach(o -> {
            //System.out.println(o);
            System.out.println(map.get(o));
        });
    }

    @Benchmark
    public void valuesIterator() {
        System.out.println("map iterator by values");
        map.values().stream().forEach(o -> {
            System.out.println(o);
        });
    }

    @Benchmark
    public void entrySetIterator() {
        System.out.println("map iterator by entrySet");
        map.entrySet().stream().forEach(o -> {
            //System.out.println(o.getKey());
            System.out.println(o.getValue());
        });
    }
}
