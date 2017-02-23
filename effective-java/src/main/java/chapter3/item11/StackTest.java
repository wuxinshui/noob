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
 * Created by wuxinshui on 2017/2/23.
 */
public class StackTest {
	public static void main(String[] args) {
		//stackMethodTest();
		stackCLoneTest();
	}

	//
	private static void stackCLoneTest(){
		Stack stack=new Stack();
		Stack stack1=stack.clone();
		stack.push("1");
		stack1.push(4);

		//实现Cloneable接口和覆盖clone方法，直接返回super.clone(),
		// 修改原始的实例会破坏被克隆对象中的约束条件
		System.out.println("stack size is : "+stack.size());
		System.out.println("stack "+stack.pop());//4
		System.out.println("stack1 size is : "+stack1.size());
		System.out.println("stack1 "+stack1.pop());//null

	}

	private static void stackMethodTest() {
		Stack stack=new Stack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
