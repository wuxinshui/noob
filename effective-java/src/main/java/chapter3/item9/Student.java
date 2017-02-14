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

/**
 * Created by wuxinshui on 2017/2/14.
 */
public class Student {
	private int age;
	private int grade;
	private int score;
	private String name;
	private PhoneNumber pn;


	public Student(int age, int grade, int score, String name, PhoneNumber pn) {
		this.age = age;
		this.grade = grade;
		this.score = score;
		this.name = name;
		this.pn = pn;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || this.getClass() != o.getClass()) return false;

		Student that = (Student) o;
		if (age != that.age) return false;
		if (grade != that.grade) return false;
		if (score != that.score) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		return pn != null ? pn.equals(that.pn) : that.pn == null;
	}

	@Override
	public int hashCode() {
		int result = age;
		result = 31 * result + grade;
		result = 31 * result + score;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (pn != null ? pn.hashCode() : 0);
		return result;
	}

}
