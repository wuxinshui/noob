package chapter4.item25;

import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ArraysListTest</p>
 * 列表优于数组
 * 1.数组是协变的，如果Sub是Super的子类型，则数组Sub[]就是Super[]的子类型。列表List则不行，会有编译错误：Incompatible types
 * 2,数组是具体的，会在运行时才检查元素类型约束。
 * 列表是通过擦除来实现的，只在编译时强化类型信息，在运行的时会擦除类型信。擦除使得泛型和和没有使用泛型的代码可以互用。
 * 3.数组提供了运行时的类型安全，但是没有编译时的类型安全。
 * 一般来说，泛型和数组不能很好地混合使用。如果混用，并且得到了编译或者运行时的错误。最好的解决办法是优先使用列表代替数组。
 *
 * @author wuxinshui
 */
public class ArraysListTest {
    public static void main(String[] args) {
        //1.数组是协变的，如果Sub是Super的子类型，则数组Sub[]就是Super[]的子类型。列表List则不行
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in";
        //Incompatible types
        //List<Object> objects = new ArrayList<Long>();
        //List<Number> numbers = new ArrayList<Long>();
        // Generic array creation:泛型数组创建错误
        // List<String>[] stringLists=new List<String>[1];


    }
}
