package chapter3.item10;

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
 * Created by wuxinshui on 2017/2/17.
 */
public class PhoneNumber {
	private final int arecode;
	private final int prefix;
	private final int lineNumber;

	public PhoneNumber(int arecode, int prefix, int lineNumber) {
		this.arecode = arecode;
		this.prefix = prefix;
		this.lineNumber = lineNumber;
	}

	/**
	 * 指定toString返回值的格式
	 * @return
	 */
	@Override
	public String toString() {
		return "PhoneNumber{" +
				"arecode=" + arecode +
				", prefix=" + prefix +
				", lineNumber=" + lineNumber +
				'}';
	}

	//指定另外一种格式
//	@Override
	public String toString1(){
		return String.format("(%03d) %03d-%04d",arecode,prefix,lineNumber);
	}

	public static void main(String[] args) {
		PhoneNumber phoneNumber=new PhoneNumber(12,23,34);
		System.out.println("默认的toString返回格式:"+phoneNumber.toString());
		System.out.println("指定的toString返回格式:"+phoneNumber.toString1());

		PhoneNumber phoneNumber1=new PhoneNumber(123,123,1234);
		System.out.println("默认的toString返回格式:"+phoneNumber1.toString());
		System.out.println("指定的toString返回格式:"+phoneNumber1.toString1());
	}
}
