package chapter2.item2.telescopingConstructor;

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
 *
 * 重叠构造器模式
 */
//Telescoping constructor pattern -does not scale well!
public class NutritionFacts {
	private final int servingSize; //(ml)		required
	private final int servings;//(per container) required
	private final int calories;//				optional
	private final int fat;//(g)					optional
	private final int sodium;//(mg)				optional
	private final int carbohydrate;//(g)		optional

	public NutritionFacts(int servingSize, int servings) {
		this(servingSize,servings,0);
	}

	public NutritionFacts(int servingSize, int servings, int calories) {
		this(servingSize,servings,calories,0);

	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
		this(servingSize,servings,calories,fat,0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize,servings,calories,fat,sodium,0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	@Override
	public String toString() {
		return "NutritionFacts{" +
				"servingSize=" + servingSize +
				", servings=" + servings +
				", calories=" + calories +
				", fat=" + fat +
				", sodium=" + sodium +
				", carbohydrate=" + carbohydrate +
				'}';
	}
}
