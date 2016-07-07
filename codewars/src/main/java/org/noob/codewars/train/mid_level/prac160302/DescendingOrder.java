package org.noob.codewars.train.mid_level.prac160302;

import java.util.Arrays;

/**
 * Description:
 * 
 * Your task is to make a function that can take any non-negative integer as a
 * argument and return it with it's digits in descending order. Descending order
 * means that you take the highest digit and place the next highest digit
 * immediately after it.
 * 
 * Examples:
 * 
 * Input: 145263 Output: 654321
 * 
 * Input: 1254859723 Output: 9875543221
 * 
 * @author Administrator
 *
 */
public class DescendingOrder {

	public static void main(String[] args) {
	}

	public static int sortDesc(final int num) {
		// Your code
		String str = String.valueOf(num);
		char[] cs = str.toCharArray();
		Arrays.sort(cs);
		System.out.println(cs);
		int j = cs.length - 1;
		StringBuilder sBuilder = new StringBuilder();
		for (int i = j; i >= 0; i--) {
			sBuilder.append(cs[i]);
		}
		return new Integer(sBuilder.toString());
	}

	/**
	 * TODO review point (Integer.toString(Integer.valueOf(num))).split("");
	 * 
	 * @param num
	 * @return
	 */
	public static int sortDesc1(final int num) {
		String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
		Arrays.sort(numbers);

		String result = "";

		for (String s : numbers) {
			result = s + result;
		}

		return Integer.parseInt(result);
	}

}
