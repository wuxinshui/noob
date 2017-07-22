package chapter6.item33;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>HerbTest</p>
 * 用EnumMap代替序数索引
 *
 * @author wuxinshui
 */
public class HerbTest {
    //香草数组，表示花园中的植物
    Herb[] garden = new Herb[]{new Herb("ANNUL", Herb.Type.ANNUL),
            new Herb("BIENNIAL", Herb.Type.BIENNIAL),
            new Herb("PERENNIAL", Herb.Type.PERENNIAL)};

    public static void main(String[] args) {
        Herb herb = new Herb("str", Herb.Type.ANNUL);
        System.out.println(herb.toString());
        // System.out.println(Herb.Type.ANNUL);

    }

    //Using ordinal() to index an array - Don't DO THIS!
    public void herbInArray() {

        Set<Herb>[] herbByType = new Set[Herb.Type.values().length];
        for (int i = 0; i < herbByType.length; i++) {
            herbByType[i] = new HashSet<>();
        }

        for (Herb h : garden) {
            herbByType[h.getType().ordinal()].add(h);
        }

        //    print the results
        for (int i = 0; i < herbByType.length; i++) {
            System.out.printf("%s:%s%n", Herb.Type.values()[i], herbByType[i]);

        }
    }

    //Using an EnumMap to associate data with an enum
    public void herbEnumMap() {
        //EnumMap 构造器采用键类型的Class对象：
        // 这是一个有限制的类型令牌（bounded type token）,
        // 它提供了运行时的泛型消息
        Map<Herb.Type, Set<Herb>> herbByType = new EnumMap<>(Herb.Type.class);

        //存贮所有的类型
        for (Herb.Type type : Herb.Type.values()) {
            herbByType.put(type, new HashSet<>());
        }

        //根据类型分拣植物
        for (Herb h : garden) {
            herbByType.get(h.getType()).add(h);
        }

        System.out.println(herbByType);

    }
}
