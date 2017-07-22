package chapter6.item31;

import java.util.Arrays;

import static chapter6.item31.Ensemble1.DECTET;

/**
 * <p>EnsembleTest</p>
 *
 * @author wuxinshui
 *         <p>
 *         永远不要根据枚举的序数导出与它关联的值，而是要将他保存在一个实例域中。
 */
public class EnsembleTest {
    public static void main(String[] args) {
        // test1();
        test2();
    }

    private static void test1() {
        // Ensemble1
        System.out.println(DECTET);
        System.out.println(DECTET.getClass().getName());

        System.out.println("输出所有的枚举常量：");
        System.out.println(Arrays.toString(Ensemble1.values()));

        //ordinal() 输出枚举常量的序数
        System.out.println("ordinal() 输出枚举常量的序数:");
        System.out.println(DECTET.ordinal());
        System.out.println(Ensemble1.NONET.ordinal());
        //numberOfMusicians() 输出枚举常亮的序数
        System.out.println("numberOfMusicians() 输出枚举常量的序数:");
        System.out.println(Ensemble1.DECTET.numberOfMusicians());
        System.out.println(Ensemble1.NONET.numberOfMusicians());


        //Ensemble1(int)' has private access in 'chapter6.item31.Ensemble1
        // Ensemble1 ensemble1=new Ensemble1(1);
    }

    private static void test2() {
        //枚举常量顺序的变化不会影响常量对应的int值。
        System.out.println("getNumberOfMusicians() 输出枚举常量的序数:");
        System.out.println(Ensemble2.DECTET.getNumberOfMusicians());
        System.out.println(Ensemble2.NONET.getNumberOfMusicians());

        System.out.println("ordinal() 输出枚举常量的序数:");
        System.out.println(Ensemble2.DECTET.ordinal());
        System.out.println(Ensemble2.NONET.ordinal());
    }
}

