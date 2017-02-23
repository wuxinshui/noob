package chapter2.item6;

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
//Eliminate obsolete reference 消除过期的引用
public class Stack {
	private Object[] elements;
	private int size=0;
	private static final int DEFAULT_INITIAL_CAPACITY=16;

	public Stack(){
		this.elements=new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object o){
		ensureCapacity();
		elements[size++]=o;
	}

	public Object pop(){
		if (size==0){
			throw new EmptyStackException();
		}
		Object result=elements[--size];
		elements[size]=null;//Eliminate obsolete reference
		return  result;
	}

	private void ensureCapacity() {
		if (elements.length==size){
			elements= Arrays.copyOf(elements,size*2+1);
		}
	}

}
