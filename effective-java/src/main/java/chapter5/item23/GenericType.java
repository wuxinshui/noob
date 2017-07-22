package chapter5.item23;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>GenericType</p>
 * 泛型:1.类型检查：只能插入指定类型；
 * 2.类型转换：获取值时编译器会自动类型转换；
 * 3.泛型有子类型化的规则：List<String>是原生态类型List的一个子类型，而不是参数化List<Object>的子类型。
 * 4.Set<Object>是个参数化类型，表示可以包含任何对象类型的一个集合；
 * Set<?>则是一个通配符类型，表示只能包含某种未知对象类型的一个集合；
 * Set则是个原生态类型，脱离了泛型系统。前两种是类型安全的，后一种不安全（破坏集合类型约束条件）。
 *
 * @author wuxinshui
 */
public class GenericType {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        //add (java.lang.String) in List cannot be applied to(int)
//        stringList.add(1);
    }
}
