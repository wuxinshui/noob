package chapter3.item11;

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
 * Created by wuxinshui on 2017/2/20.
 */
//Clone方法的通用约定非常弱，创建和返回该对象的一个拷贝，
// 拷贝的精确含义取决于该对象的类。一般含义是：
//true:x.clone()!=x,x.clone().getClass()==x.getClass(),
// true:x.clone().equals(x),实际结果是false。
public class NormalCloneTest implements Cloneable{
	public static void main(String[] args) throws CloneNotSupportedException {
		cloneTest();
	}


	public static void cloneTest() throws CloneNotSupportedException {
		NormalCloneTest c1=new NormalCloneTest();
		NormalCloneTest c2= null;
		try {
			c2 = (NormalCloneTest) c1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("c1!=c2 "+(c1!=c2));
		System.out.println("c1.getClass() == c2.getClass() "+(c1.getClass()==c2.getClass()));
		System.out.println("c1.equals(c2) "+(c1.equals(c2)));
		System.out.println("c2.equals(c1) "+(c2.equals(c1)));
		System.out.println("c1.clone()==c1 "+c1.clone().equals(c1));
	}
}
