package chapter2.item5;

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

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by wuxinshui on 2017/2/9.
 */
public class SlowPerson {
	private final Date birthDate;

	public boolean isBabyBoomer() {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		calendar.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date start_boom = calendar.getTime();
		calendar.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date end_boom = calendar.getTime();
		return birthDate.compareTo(start_boom) > 0 && birthDate.compareTo(end_boom) < 0;
	}

	public SlowPerson(Date birthDate) {
		this.birthDate = birthDate;
	}

	public static void main(String[] args) {
		SlowPerson smartPerson = new SlowPerson(new Date());
		long s=System.currentTimeMillis();
		for (long i = 0; i < 1000000; i++) {
//			System.out.println("baby boomer :" + smartPerson.isBabyBoomer());
			smartPerson.isBabyBoomer();
		}

		System.out.println("time is : "+(System.currentTimeMillis()-s));
	}
}
