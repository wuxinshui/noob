package org.noob.codewars.train.junior.prac160311;

import java.util.Arrays;

/**
 * A perfect power is a classification of positive integers:
 * 
 * In mathematics, a perfect power is a positive integer that can be expressed
 * as an integer power of another positive integer. More formally, n is a
 * perfect power if there exist natural numbers m > 1, and k > 1 such that mk =
 * n. Your task is to check wheter a given integer is a perfect power. If it is
 * a perfect power, return a pair m and k with mk = n as a proof. Otherwise
 * return Nothing, Nil, null, None or your language's equivalent.
 * 
 * Note: For a perfect power, there might be several pairs. For example 81 = 3^4
 * = 9^2, so (3,4) and (9,2) are valid solutions. However, the tests take care
 * of this, so if a number is a perfect power, return any pair that proves it.
 * 
 * Examples
 * 
 * isPerfectPower(4) => new int[]{2,2} isPerfectPower(5) => null
 * isPerfectPower(8) => new int[]{2,3} isPerfectPower(9) => new int[]{3,2}
 *
 *Process was terminated. It took longer than 10000ms to complete
 */
public class PerfectPower_Test {

	public static void main(String[] args) {
		int n = 484;
		System.out.println(Arrays.toString(isPerfectPower(n)));
//		System.out.println(9>>2);
	}

	public static int[] isPerfectPower(int n) {
		Double step=Math.ceil(new Double(n/2));
		for (int i = 1; i <=step; i++) {
			for (int j = 1; j <=step; j++) {
				Double power = Math.pow(i, j);
				if (n == power) {
					int[] pw = new int[] { i, j };
					return pw;
				}
			}
		}
		return null;
	}

}
