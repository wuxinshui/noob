package chapter2.item5;

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
 * Created by wuxinshui on 2017/2/9.
 */
//要优先使用基本类型而不是装箱基本类型，要当心无意识的自动装箱
public class BoxedPrimitiveType {
	public static void main(String[] args) {
		long s1=System.currentTimeMillis();
		longSum();
		System.out.println("基本类型long sum 执行时间："+(System.currentTimeMillis()-s1));
		long s2=System.currentTimeMillis();
		LongSum();
		System.out.println("装箱基本类型Long sum 执行时间："+(System.currentTimeMillis()-s2));
	}

	//基本类型long sum
	private static void longSum(){
		long sum=0l;
		for (long i=0;i<Integer.MAX_VALUE;i++){
			//大约每次往Long sum中增加long时构造一个实例
			sum+=i;
		}
		System.out.println("longSum 计算的和是："+sum);
	}
	//装箱基本类型Long sum
	private static void LongSum(){
		Long sum=0l;
		for (long i=0;i<Integer.MAX_VALUE;i++){
			//大约每次往Long sum中增加long时构造一个实例
			sum+=i;
		}
		System.out.println("LongSum 计算的和是："+sum);
	}

}
