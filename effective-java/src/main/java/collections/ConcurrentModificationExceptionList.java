package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author:Wuxinshui
 * @Date:2017/5/24 9:53
 */
public class ConcurrentModificationExceptionList {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		for (Integer integer : list1) {
			if (integer == 1) {
				list1.remove(integer);
			}
		}

		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i)==1){
				list1.remove(i);
				i--;//指向删除前的上一个元素
			}
		}
		System.out.println(list1);
	}
}
