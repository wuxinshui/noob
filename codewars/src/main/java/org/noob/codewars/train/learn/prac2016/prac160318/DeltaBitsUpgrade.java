package org.noob.codewars.train.learn.prac2016.prac160318;


public class DeltaBitsUpgrade {
	public static void main(String[] args) {
		int a = 7;
		int b = 17;
		System.out.println(Integer.toBinaryString(a&0xff));
		System.out.println(Integer.toBinaryString(b&0xff));
		System.out.println(convertBits(a, b));
		
	}

	public static int convertBits(int a, int b) {
		String aStr = Integer.toBinaryString(a);
		String bStr = Integer.toBinaryString(b);
		char[] ac = aStr.toCharArray();
		char[] bc = bStr.toCharArray();
		int count = 0;
		if (ac.length < bc.length) {
			return delat(count, ac, bc);
		} else if (ac.length == bc.length) {
			return delat(count, ac, bc);
		} else {
			return delat(count, bc, ac);
		}

	}

	private static int delat(int count, char[] min, char[] max) {
		for (int i = 0; i < min.length; i++) {
			if (min[i] != max[i]) {
				count++;
			}
		}
		count += max.length - min.length;
		return count;
	}
}
