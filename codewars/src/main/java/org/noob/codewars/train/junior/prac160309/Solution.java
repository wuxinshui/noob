package org.noob.codewars.train.junior.prac160309;

import java.math.BigDecimal;

/**
 * Write a program that will calculate the number of trailing zeros in a
 * factorial of a given number.
 * 
 * N! = 1 * 2 * 3 * 4 ... N
 * 
 * zeros(12) = 2 # 1 * 2 * 3 .. 12 = 479001600 that has 2 trailing zeros
 * 4790016(00) Be careful 1000! has length of 2568 digital numbers.
 * 
 * @author Administrator
 *Process was terminated. It took longer than 10000ms to complete

 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(zeros(1000));
	}

	public static int zeros(int n) {
		BigDecimal big=new BigDecimal(1);
		for (int i = 2; i <= n; i++) {
			big=big.multiply(new BigDecimal(i));
		}
		BigDecimal count=BigDecimal.ZERO;
//		System.out.println(big);
//		System.out.println(big.remainder(new BigDecimal(10)));
		while(big.remainder(new BigDecimal(10)).equals(BigDecimal.ZERO)){
			big=big.divideAndRemainder(new BigDecimal(10))[0];
			count=count.add(BigDecimal.ONE);
		}
		return count.intValue();
	}

}
