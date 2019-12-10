package java8.list;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/12/10 11:37
 */
public class ListListStream {
    public static void main(String[] args) {
        List<Integer> list1=List.of(1,2,3,4,5);
        List<Integer> list2=List.of(1,2,3,4,5);
        List<Integer> list3=List.of(1,2,3,4,5);
        List<List<Integer>> listList=List.of(list1,list2,list3);
        System.out.println(listList);

    //    List合并
        List<Integer> oneList=listList.parallelStream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(oneList);
    }
}
