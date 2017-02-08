package chapter2.item2.builderPattern;

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
 * Created by wuxinshui on 2017/2/8.
 */
public class Client {
	public static void main(String[] args) {
		NutritionFacts nutritionFacts=new NutritionFacts.Builder(20,30).calories(40).carbohydrate(50).fat(60).sodium(70).build();
		System.out.println(nutritionFacts);
		NutritionFacts nutritionFacts1=new NutritionFacts(new NutritionFacts.Builder(20,30));
		System.out.println(nutritionFacts1);
		NutritionFacts nutritionFacts2=new NutritionFacts.Builder(20,30).fat(30).build();
		System.out.println(nutritionFacts2);
		NutritionFacts.Builder builder=new NutritionFacts.Builder(20,30);
		builder.calories(40);
		builder.fat(50);
		NutritionFacts nutritionFacts3=builder.build();
		System.out.println(nutritionFacts3);

	}
}
