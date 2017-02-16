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
 * Created by wuxinshui on 2017/2/13.
 */
//子类增加的信息会影响equals比较的结果
public class ColorPoint extends Point {
	private final Color color;
	public ColorPoint(int x, int y,Color color) {
		super(x, y);
		this.color=color;
	}

	@Override
	public boolean equals(Object o){
		if (!(o instanceof Point)){
			return false;
		}
		//If o is normal Point, do a color-blind comparison
		//忽略颜色信息
		// 保护了对称性，牺牲了传递性
		if (!(o instanceof ColorPoint)){
			return o.equals(this);
		}

		//If o is normal ColorPoint, do a full comparison
		return super.equals(o) && this.color==((ColorPoint) o).color;
	}

	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(12,23,Color.GREY);
		Point p=new Point(12,23);
		//保护了对称性，牺牲了传递性
		System.out.println("cp==p: "+cp.equals(p));
		System.out.println("p==cp: "+p.equals(cp));

		//保护了对称性，牺牲了传递性
		ColorPoint cp1=new ColorPoint(12,23,Color.RED);
		System.out.println("p==cp1: "+(p.equals(cp1)));
		System.out.println("cp==cp1: "+(cp.equals(cp1)));



	}

}
