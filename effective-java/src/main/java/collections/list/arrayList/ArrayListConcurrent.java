package collections.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author:Wuxinshui
 * @Date:2017/7/20 14:59
 */
public class ArrayListConcurrent {

	//private List<Integer> uplayerList = new ArrayList<>();
	//private List<Integer> uplayerList = Collections.synchronizedList(new ArrayList<>());
	private  List<Integer>  uplayerList;

	public void test(String msg) {
		uplayerList = new ArrayList<>();
		//uplayerList = Collections.synchronizedList(new ArrayList<>());
		test1(1);
		test2(2);
		test3(3);
		System.out.println(msg+" : "+uplayerList);
	}


	private void test1(int i) {
		uplayerList.add(i);
	}

	private void test2(int i) {
		uplayerList.add(i);
	}

	private void test3(int i) {
		uplayerList.add(i);
	}
}
