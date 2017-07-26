package collections.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author:Wuxinshui
 * @Date:2017/7/20 14:59
 */
public class ArrayListConcurrentReference {

	public void test(String msg, int i) {

		List<Integer> upLayerList = new ArrayList<>();
		test1(i,upLayerList);
		test2(i + 1,upLayerList);
		test3(i + 2,upLayerList);
		System.out.println(msg + " : " + upLayerList);

	}


	private void test1(int i,List<Integer> upLayerList) {
		upLayerList.add(i);
	}

	private void test2(int i,List<Integer> upLayerList) {
		upLayerList.add(i);
	}

	private void test3(int i,List<Integer> upLayerList) {
		upLayerList.add(i);
	}
}
