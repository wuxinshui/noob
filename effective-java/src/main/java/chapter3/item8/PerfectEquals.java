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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuxinshui on 2017/2/16.
 */
//实现高质量equals方法的诀窍
//1. 使用==操作符检查“参数是否为这个对象的引用”。
//2. 使用instanceof操作符检查“参数是否为正确的类型”。
//3. 把参数转化为正确的类型。
//4. 对于该类的中每个关键域，检查参数中的域是否与该对象中对应的域想匹配。
public class PerfectEquals {
	//基本类型
	private int x;
	private char c;
	private double d;
	private float f;
	private String name;//引用类型
	private Color color;//枚举类型
	private Point point;//引用类型
	private List<Point> pointList;//集合类


	public PerfectEquals(int x, char c, double d, float f, String name, Color color, Point point, List<Point> pointList) {
		this.x = x;
		this.c = c;
		this.d = d;
		this.f = f;
		this.name = name;
		this.color = color;
		this.point = point;
		this.pointList = pointList;
	}

	@Override
	public boolean equals(Object o) {
		//1. 使用==操作符检查“参数是否为这个对象的引用”。
		if (this == o) return true;
		//2. 使用instanceof操作符检查“参数是否为正确的类型”。
		if (!(o instanceof PerfectEquals)) return false;
		//3. 把参数转化为正确的类型。
		PerfectEquals that = (PerfectEquals) o;

		//4. 对于该类的中每个关键域，检查参数中的域是否与该对象中对应的域想匹配。
		if (x != that.x) return false;
		if (c != that.c) return false;
		if (Double.compare(that.d, d) != 0) return false;
		if (Float.compare(that.f, f) != 0) return false;
//		if (name != null ? !name.equals(that.name) : that.name != null) return false;//10000000 times compare cost time is 27-32ms
		if (name!=that.name|| name!=null&&!name.equals(that.name)) return false;//更快些，10000000 times compare cost time is 3-4ms
		if (color != that.color) return false;
//		if (point != null ? !point.equals(that.point) : that.point != null) return false;
		if (point!=that.point||point!=null&&!point.equals(that.point)) return false;
//		return pointList != null ? pointList.equals(that.pointList) : that.pointList == null;
		return pointList==that.pointList|| pointList!=null&&pointList.equals(that.pointList);
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = x;
		//31是一个奇素数，有个很好的特性，乘法可以优化为移位和减法：31*i==(i<<5)-i。
		// 现在的VM可以自动完成这种优化。习惯上都使用素数来计算散列结果
		result = 31 * result + (int) c;
		temp = Double.doubleToLongBits(d);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (f != +0.0f ? Float.floatToIntBits(f) : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (color != null ? color.hashCode() : 0);
		result = 31 * result + (point != null ? point.hashCode() : 0);
		result = 31 * result + (pointList != null ? pointList.hashCode() : 0);
		return result;
	}

	public static void main(String[] args) {
		List<Point> pointList=new ArrayList<>();
		Point point1=new Point(1,2);
		Point point2=new Point(2,2);
		Point point3=new Point(3,2);
		pointList.add(point1);
		pointList.add(point2);
		pointList.add(point3);

		PerfectEquals pe1=new PerfectEquals(12,'c',12D,21f,"Perfect",Color.RED,new Point(23,24),pointList);
		PerfectEquals pe2=new PerfectEquals(12,'c',12D,21f,"Perfect",Color.RED,new Point(23,24),pointList);

		long start=System.currentTimeMillis();
		for (int i=0;i<10000000;i++){
			pe1.equals(pe2);
		}
		long end=System.currentTimeMillis();
		System.out.println("compare cost time is :"+(end-start));
	}
}
