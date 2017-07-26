package collections.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:开发中，存在这样的业务逻辑，类似倒金字塔结构，
 * 下层数据需要基于上层的数据进行逻辑计算。设计思路是：
 * 定义一个全局变量upLayerList，来保存上一层的数据。
 * 每一层计算仅需要知道upLayerList就可以，
 * 不用关心上一层数据怎么获取。当前层计算完毕后，
 * 把结果赋值给upLayerList，留给下一层使用。
 * @Author:Wuxinshui
 * @Date:2017/7/20 14:59
 */
public class ArrayListConcurrentSynchronized {

	//private List<Integer> uplayerList = new ArrayList<>();
	//private List<Integer> uplayerList = Collections.synchronizedList(new ArrayList<>());
	private List<Integer> upLayerList;

	public void test(String msg, int i) {

		//synchronized (this) {
		upLayerList = new ArrayList<>();

		upLayerList = Collections.synchronizedList(new ArrayList<>());
		test1(i);
		test2(i + 1);
		test3(i + 2);
		System.out.println(msg + " : " + upLayerList);
		//}

	}


	/**
	 * 模拟业务逻辑实现
	 *
	 * @param i
	 */
	private void test1(int i) {
		upLayerList.add(i);
	}

	/**
	 * 模拟业务逻辑实现
	 *
	 * @param i
	 */
	private void test2(int i) {
		upLayerList.add(i);
	}

	/**
	 * 模拟业务逻辑实现
	 *
	 * @param i
	 */
	private void test3(int i) {
		upLayerList.add(i);
	}
}
