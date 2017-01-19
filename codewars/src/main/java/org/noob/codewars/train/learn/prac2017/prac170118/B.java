package org.noob.codewars.train.learn.prac2017.prac170118;

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

import java.util.Arrays;

/**
 * Created by wuxinshui on 2017/1/19.
 *
 * 类静态成员初始化
 *
 * 首先加载主类B，初始化静态成员Y，发现需要类A的信息，于是加载类A，初始化静态成员X，
 * 也用到B类信息，由于此时B类的Y还未成功加载因此这里是默认值0，从而得到A类的X为1，然后返回到B类，得到Y为2。
 */
public class B {
	public static int Y= A.X + 1;;
	static {
	}

	public static void main(String[] args) {
		System.out.println("X = "+A.X+", Y = "+B.Y);
		calc(1,2,3);
	}

	/**
	 * 变长参数
	 * @param ins
	 */
	public static void calc(int... ins){
		System.out.println(Arrays.toString(ins));
	}
}
