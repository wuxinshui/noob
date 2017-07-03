package chapter4.item27;

import java.util.*;

/**
 * <p>GenericMethod</p>
 * 优先考虑泛型方法
 * 静态工具方法尤其适合于泛型化
 *
 * @author wuxinshui
 */
public class GenericMethod {
    public static void main(String[] args) {
        //2种方式
        Map<String, String> map = new HashMap();
        map.put("1", "1");
        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "1");

        //非泛型方法
        Set s1 = new HashSet(Arrays.asList("Tom", "Dick", "Harry"));
        Set s2 = new HashSet(Arrays.asList("Larry", "Moe", "Curly"));
        Set result = union(s1, s2);
        System.out.println(result);

        //    泛型方法 提供了类型安全性，也更容易使用
        // 编译器通过检查方法参数的类型来计算类型参数的值，这个过程叫类型推导。
        //编译器发行union1的两个参数都是Set<String>类型，因此知道类型参数E必须为String。
        Set<String> s3 = new HashSet<>(Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> s4 = new HashSet<>(Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> result1 = union1(s3, s4);
        System.out.println(result1);
    }


    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    //Generic method
    public static <E> Set<E> union1(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }
}
