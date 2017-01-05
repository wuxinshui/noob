package org.noob.codewars.train.learn.prac2016.prac160318;

public class DeltaBits {
	public static void main(String[] args) {
		int a = 31;
		int b = 14;
		System.out.println(convertBits(a, b));
	}

	public static int convertBits(int a, int b) {
		String aStr = Integer.toBinaryString(a);
		String bStr = Integer.toBinaryString(b);
		char[] ac = aStr.toCharArray();
		char[] bc = bStr.toCharArray();
		int count = 0;
		if (ac.length < bc.length) {
			for (int i = 0; i < ac.length; i++) {
				if (ac[i] != bc[i]) {
					count++;
				}
			}
			count += bc.length - ac.length;
		} else if (ac.length == bc.length) {
			for (int i = 0; i < ac.length; i++) {
				if (ac[i] != bc[i]) {
					count++;
				}
			}
		} else {
			for (int i = 0; i < bc.length; i++) {
				if (ac[i] != bc[i]) {
					count++;
				}
			}
			count += ac.length - bc.length;
		}

		return count;
	}
}
