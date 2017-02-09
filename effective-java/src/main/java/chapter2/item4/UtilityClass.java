package chapter2.item4;

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
public class UtilityClass {
	//企图通过将类做成抽象类来强制该类不可被实例化，这是行不通的。
	// 该类可以被子类化，并且该子类也可以被实例化
	//通过私有构造器强化不可实例化的能力
	private UtilityClass(){
		throw new AssertionError();
	}
}
