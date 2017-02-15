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
		eq();
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
