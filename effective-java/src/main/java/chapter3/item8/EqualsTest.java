package chapter3.item8;

/**
 * Copyright [2017$] [Wuxinshui]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wuxinshui on 2017/2/15.
 */
public class EqualsTest {
	public static void main(String[] args) {
		point1ComparePoint2();
		//eq();
	}

	public static void point1ComparePoint2(){
		//getClass测试代替instanceof 测试
		//只有当对象有相同的实现时，才能使对象等同
		//if (obj==null || getClass()!=obj.getClass()) return false;
		Point point1=new Point1(1,2);
		Point point2=new Point2(1,2);
		Point point3=new Point2(1,2);

		//不同实现的比较
		System.out.println(point1.equals(point2));
		System.out.println(point2.equals(point1));

		//相同实现的比较
		System.out.println(point2.equals(point3));

	}

	//集合比较，集合里面的每个元素都要比较
	public static void eq(){
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		List<String> list1=new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");

		System.out.println("list equal list1 : "+list.equals(list1));
	}
}
