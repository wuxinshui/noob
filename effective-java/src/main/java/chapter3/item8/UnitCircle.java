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

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wuxinshui on 2017/2/15.
 */
public class UnitCircle {
	//Initialize UnitCircle to contain all points on the unit circle;
	private final static Set<Point> unitCircle;

	static {
		unitCircle=new HashSet<>();
		unitCircle.add(new Point(1,0));
		unitCircle.add(new Point(0,1));
		unitCircle.add(new Point(-1,0));
		unitCircle.add(new Point(0,-1));
	}

	public static boolean onUnitCircle(Point p){
		return unitCircle.contains(p);
	}


	public static void main(String[] args) {
		//Class Point add hashCode method ,the result is :true;
		System.out.println("Point(1,2) is on unit circle: "+(onUnitCircle(new Point(1,0))));

		CounterPoint counterPoint=new CounterPoint(1,0);

		unitCircle.add(counterPoint);
		System.out.println(onUnitCircle(new CounterPoint(1,2)));
	}
}
