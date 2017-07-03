package chapter4.item28;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>InvariantParamType</p>
 *
 * @author wuxinshui
 */
public class InvariantParamType {
    public static void main(String[] args) {
        genericInvariant();

    }

    //泛型不可变
    private static void genericInvariant() {
        //参数化类型是不可变的。
        //虽然List<String>不是List<Object>的子类型，但是可以将任何对象放进List<Object>中，
        //却只能将字符串放进List<String>
        List<Object> objectList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        objectList.add("");
        stringList.add("");
        objectList.addAll(stringList);
        //编译不通过
        // List<Object> stringObj=new ArrayList<String>();
    }
}
