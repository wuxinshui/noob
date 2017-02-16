package chapter3.item9;

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
 * Created by wuxinshui on 2017/2/14.
 */
//覆盖equals时总要覆盖hashCode
public class PhoneNumber {
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;


	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode,999,"area code");
		rangeCheck(prefix,999,"prefix");
		rangeCheck(lineNumber,9999,"line number");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	private void rangeCheck(int arg, int max, String name) {
		if (arg<0 || arg>max){
			throw new IllegalArgumentException(name+"："+arg);
		}
	}

	//重写equals方法
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		//getClass测试代替instanceof 测试
		//只有当对象有相同的实现时，才能使对象等同
		if (!(o instanceof PhoneNumber)) return false;

		PhoneNumber that = (PhoneNumber) o;

		if (areaCode != that.areaCode) return false;
		if (prefix != that.prefix) return false;
		return lineNumber == that.lineNumber;
	}

	//散列函数
	@Override
	public int hashCode() {
		int result = (int) areaCode;
		//31是一个奇素数，有个很好的特性，乘法可以优化为移位和减法：31*i==(i<<5)-i。
		// 现在的VM可以自动完成这种优化。习惯上都使用素数来计算散列结果
		result = 31 * result + (int) prefix;
		result = 31 * result + (int) lineNumber;
		return result;
	}
}
