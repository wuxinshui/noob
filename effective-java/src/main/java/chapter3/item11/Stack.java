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

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by wuxinshui on 2017/2/23.
 */
public class Stack implements Cloneable{
	//private final Object[] elements;//final型的类型域，clone方法禁止赋新值
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 2;

	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object o) {
		ensureCapacity();
		elements[size++] = o;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		elements[size] = null;//Eliminate obsolete reference
		return result;
	}


	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, size * 2 + 1);
		}
	}

	//实际上，clone就是一个构造器，必须确保它不会伤害到原始的对象，
	// 并确保正确的创建被克隆对象中的约束条件。
	@Override
	public Stack clone(){
		try {
			Stack result=(Stack) super.clone();
			//不需要将结果转为Object[],Since Java1.5,在数组上调用clone返回的数组，其编译时类型和被克隆的数组类型相同
			result.elements=elements.clone();//递归调用clone，确保不会伤害到原始的对象，
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();//Can't happen
		}
	}

	public int size(){

		return size;
	}


}
