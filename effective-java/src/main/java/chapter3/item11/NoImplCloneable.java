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
 * Created by wuxinshui on 2017/2/22.
 */
public class NoImplCloneable {
	public NoImplCloneable() {
	}

	public static void main(String[] args)  {
		cloneCompare();
	}

	//Object的clone方法会返回该对象的逐域拷贝，如果不实现
	// Cloneable接口，会抛出CloneNotSupportedException异常。
	private static void cloneCompare()  {
		NoImplCloneable c1=new NoImplCloneable();
		NoImplCloneable c2= null;
		try {
			c2 = (NoImplCloneable) c1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("c1==c2 "+(c1==c2));
		System.out.println("c1.getClass() == c2.getClass() "+(c1.getClass()==c2.getClass()));
		System.out.println("c1.equals(c2) "+(c1.equals(c2)));
	}
}
