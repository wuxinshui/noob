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
//从Java1.5之后，覆盖方法的返回类型可以是被覆盖方法的返回类型的子类。
// 这样有助于覆盖方法能够提供更多关于被返回对象的信息。
public class FatherOverride {
	public FatherOverride getInstance() {
		System.out.println("get a FatherOverride instance...");
		return new FatherOverride();
	}
}
