package chapter3.item8;

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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuxinshui on 2017/2/13.
 */
//Broken - violates symmetry
	//equals约定：自反性，对象必须等于其自身
public class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		if (s==null)
			throw new NullPointerException();
		this.s = s;
	}

	//Broken -violates symmetry
	//违反对称性
	@Override
	public boolean equals(Object o) {
		if (o instanceof  CaseInsensitiveString){
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		}
		//equals方法的意图很好，它企图与普通的字符串（String）对象进行互操作。
		if (o instanceof String){
			return s.equalsIgnoreCase((String) o);
		}
		return false;
	}

	public static void main(String[] args) {
		CaseInsensitiveString cis=new CaseInsensitiveString("Polish");
		String s ="polish";

		System.out.println(cis.equals(s));
		System.out.println(s.equals(cis));

		CaseInsensitiveString cis1=cis;
		System.out.println(cis1.equals(cis));

		List<CaseInsensitiveString> cisList=new ArrayList<>();
		cisList.add(cis);
		if (cisList.contains(s)){
			System.out.println("cisList contains");
		}else {
			System.out.println("cisList not contains");
		}
	}

	//重构后的equals方法
	public boolean equalss(Object o){
		return o instanceof CaseInsensitiveString && s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
	}

}
