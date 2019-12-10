package java8.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/12/10 16:26
 */
public class DistinctStreamList {
    public static void main(String[] args) {
        List<String> list=List.of("1","2","2","2","A","A","N");
        System.out.println(list);;
        list= list.parallelStream().distinct().collect(Collectors.toList());
        System.out.println(list);

        List<Integer> integerList=List.of(1,2,3);
        integerList=integerList.subList(0,5);
        System.out.println(integerList);
    }
}
