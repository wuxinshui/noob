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

/**
 * Created by wuxinshui on 2017/2/16.
 */
//复合优于继承
// Adds a value component without violating the equals contract
public class ColorPoint1 {
	private final Color color;
	private final Point point;

	public ColorPoint1(int x, int y, Color color) {
		point = new Point(x, y);
		this.color = color;
	}

	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint1)) return false;
		ColorPoint1 cp1 = (ColorPoint1) o;
		return cp1.point.equals(point) && cp1.color == color;
	}

	public static void main(String[] args) {
		ColorPoint1 cp1 = new ColorPoint1(1, 2, Color.RED);
		ColorPoint1 cp2 = new ColorPoint1(1, 2, Color.RED);

		System.out.println("cp1==cp2 " + (cp1 == cp2));
	}
}
