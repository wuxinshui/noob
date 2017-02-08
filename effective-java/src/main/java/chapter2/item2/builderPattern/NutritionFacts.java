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
 * Builder 模式 ，不直接生成想要的对象，而是让客户端利用所有必要的参数调用构造器（或者静态工厂），
 * 得到一个builder对象。然后客户端在builder对象上调用类似setter的方法，来设置每个相关的可选参数。
 * 最后，客户端调用午餐的build方法来生成不可变的对象。这个builder是它构建的类的静态成员类。
 */
public class NutritionFacts {
	private final int servingSize; //(ml)		required
	private final int servings;//(per container) required
	private final int calories;//				optional
	private final int fat;//(g)					optional
	private final int sodium;//(mg)				optional
	private final int carbohydrate;//(g)		optional

	public static class Builder {
		//Required parameters
		private final int servingSize; //(ml)		required
		private final int servings;//(per container) required

		//Optional parameters - initialized to default values
		private int calories = 0;//				optional
		private int fat = 0;//(g)					optional
		private int sodium = 0;//(mg)				optional
		private int carbohydrate = 0;//(g)		optional

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}

	public NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
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
