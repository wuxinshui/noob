package org.noob.codewars.train.learn.prac2017.prac170210;

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

/**
 * Created by wuxinshui on 2017/2/10.
 */
public class Test {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		method(a,b);//需要在method方法被调用之后，仅打印出a=100,b=200,请写出method方法的代码。
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

	private static void method(final Integer a,final int b) {
		System.out.println("a="+100);
		System.out.println("b="+200);
		System.exit(0);
	}
}
