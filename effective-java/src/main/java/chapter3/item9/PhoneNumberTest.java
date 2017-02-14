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

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuxinshui on 2017/2/14.
 */
public class PhoneNumberTest {
	public static void main(String[] args) {
		PhoneNumber ph=new PhoneNumber(707,867,5309);;
		System.out.println("ph hashcode is :"+ph.hashCode());
		PhoneNumber ph1=ph;
		System.out.println("ph1 hashcode is :"+ph1.hashCode());
		System.out.println("ph == ph1 : "+(ph==ph1));


		Map<PhoneNumber,String> map=new HashMap<>();
		map.put(ph,"Jerny");

		String name=map.get(new PhoneNumber(707,867,5309));
		String name1=map.get(ph);

		System.out.println("Jerny : "+("Jerny".equals(name)));
		System.out.println("Jerny1 : "+("Jerny".equals(name1)));
	}
}
