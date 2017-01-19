package org.noob.codewars.train.learn.prac2017.prac170119;

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
 * Created by wuxinshui on 2017/1/19.
 * 零宽度空格 是一个Unicode字符，是一个空格，关键是它没有宽度，因此我们一般肉眼看不到。但可以在vim下看到
 *  System.out.println(Integer.parseInt("<feff>2"));
 */
public class IntegerTest {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("1"));
		//零宽度空格
		System.out.println(Integer.parseInt("﻿2"));
//		System.out.println((int)"﻿2".charAt(0));
	}
}
