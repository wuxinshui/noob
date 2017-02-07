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
//JavaBeans pattern - allows inconsistency,mandates mutability
public class NutritionFacts {
	//Parameters initialized to default values (if any)
	private  int servingSize=-1; //(ml)		required
	private  int servings=-1;//(per container) required
	private  int calories=0;//				optional
	private  int fat=0;//(g)					optional
	private  int sodium=0;//(mg)				optional
	private  int carbohydrate=0;//(g)		optional

	public NutritionFacts() {
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
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
