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
//只有基本数据类型、不可变对象的引用类型除了实现Cloneable接口以外，只需要对clone方法提供公有访问路径。
public class PhoneNumber implements Cloneable{
	private  int arecode;
	private  int prefix;
	private  int lineNumber;
	private final int country;

	public PhoneNumber(int arecode, int prefix, int lineNumber,int country) {
		this.arecode = arecode;
		this.prefix = prefix;
		this.lineNumber = lineNumber;
		this.country = country;
	}


//clone方法返回的是PhoneNumber而不是Object，从Java1.5之后是合法的，因为引入了协变返回类型作为泛型。
// 换句话说，覆盖方法的返回类型可以是被覆盖方法的返回类型的子类。
	@Override
	public PhoneNumber clone(){
		try {
			//永远不要让客户去做任何类库能够替客户完成的事情
			//由于Object的clone方法返回Object，PhoneNumber.clone必须在返回结果之前将类型转换
			return (PhoneNumber) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();//Can't happen
		}
	}


//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (!(o instanceof PhoneNumber)) return false;
//
//		PhoneNumber that = (PhoneNumber) o;
//
//		if (arecode != that.arecode) return false;
//		if (prefix != that.prefix) return false;
//		if (lineNumber != that.lineNumber) return false;
//		return country == that.country;
//	}
//
//	@Override
//	public int hashCode() {
//		int result = arecode;
//		result = 31 * result + prefix;
//		result = 31 * result + lineNumber;
//		result = 31 * result + country;
//		return result;
//	}

	public static void main(String[] args) {
		PhoneNumber phn=new PhoneNumber(12,23,34,34);
		PhoneNumber phn1=phn.clone();

		System.out.println("phn==phn1 "+(phn.equals(phn1)));
	}
}
