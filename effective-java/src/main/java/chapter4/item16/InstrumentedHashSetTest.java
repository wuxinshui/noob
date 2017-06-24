package chapter4.item16;

/**
 * <p>InstrumentedHashSetTest</p>
 *
 * @author wuxinshui
 */
public class InstrumentedHashSetTest {
    public static void main(String[] args) {
        InstrumentedHashSet<String> instrumentedHashSet=new InstrumentedHashSet();
        instrumentedHashSet.add("1");
        instrumentedHashSet.add("2");
        instrumentedHashSet.add("3");

        System.out.println(instrumentedHashSet.getAddCount());

        instrumentedHashSet.addAll(instrumentedHashSet);

        System.out.println(instrumentedHashSet.getAddCount());
    }
}
