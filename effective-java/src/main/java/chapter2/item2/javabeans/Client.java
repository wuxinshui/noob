package chapter2.item2.javabeans;

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
 * Created by wuxinshui on 2017/2/7.
 */
public class Client {
	public static void main(String[] args) {
		NutritionFacts nutritionFacts=new NutritionFacts();
		nutritionFacts.setCalories(12);
		nutritionFacts.setCarbohydrate(23);
		nutritionFacts.setFat(0);
		nutritionFacts.setServings(123);
		nutritionFacts.setSodium(1234);
		System.out.println(nutritionFacts);
	}
}
