package chapter3.item10;

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

import org.junit.Assert;

/**
 * Created by wuxinshui on 2017/2/17.
 */
//当对象被传递给println、printf、字符串联操作符（+）
// 以及assert或者被调试器打印出来时，toString方法会被自动调用
public class ToStringTest {
	public static void main(String[] args) {
		ToStringTest test=new ToStringTest();
		System.out.println(test.toString());
		//当对象被传递给println、printf、字符串联操作符（+）
		// 以及assert或者被调试器打印出来时，toString方法会被自动调用
		System.out.println(test);
		System.out.printf("",test);
		System.out.println("toString方法会被自动调用："+(test));
		Assert.assertNotNull(test);

		System.out.println("Thread toString() :"+(new Thread().toString()));;

		System.out.println("基本类型包装类 toString():"+(new Integer(1222).toString()));
	}
}
