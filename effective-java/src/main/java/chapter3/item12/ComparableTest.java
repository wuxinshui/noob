package chapter3.item12;

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
 * Created by wuxinshui on 2017/2/21.
 */
public class ComparableTest {
	public static void main(String[] args) {
		//实现Comparable接口的类就表明它的实例具有内在的排序关系（自然排序）
		//String implements java.io.Serializable, Comparable<String>, CharSequence
		Arrays.sort(args);
	}
}
