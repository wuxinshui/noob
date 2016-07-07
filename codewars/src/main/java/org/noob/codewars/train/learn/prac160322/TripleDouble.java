package org.noob.codewars.train.learn.prac160322;

/**
 * Write a function
 * 
 * TripleDouble(long num1, long num2) which takes in numbers num1 and num2 and
 * returns 1 if there is a straight triple of a number at any place in num1 and
 * also a straight double of the same number in num2. For example:
 * TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s
 * and // num2 has straight double 99s
 * 
 * TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has
 * only a single 2
 * 
 * TripleDouble(12345, 12345) == 0
 * 
 * TripleDouble(666789, 12345667) == 1 If this isn't the case, return 0
 *
 */
public class TripleDouble {

	public static void main(String[] args) {
		long num1 = 451999277l, num2 = 411777228999l;
		System.out.println(tripleDouble(num1, num2));
		// System.out.println(String.valueOf(num1).charAt(0));
		System.out.println(tripleDouble2(num1, num2));
	}

	public static int tripleDouble(long num1, long num2) {
		if (num1 == num2) {
			return 0;
		}
		String string1 = String.valueOf(num1);
		String string2 = String.valueOf(num2);
		char triple = '0';
		for (int i = 0; i < string1.length() - 2; i++) {
			if (string1.charAt(i) == string1.charAt(i + 1) && string1.charAt(i) == string1.charAt(i + 2)) {
				triple = string1.charAt(i);
				break;
			}
		}
		int first = string2.indexOf(triple);
		int second = string2.lastIndexOf(triple);

		return (second - first == 1) ? 1 : 0;
	}
	
	 public static int tripleDouble2(long num1, long num2) {
		    if ((num1 + "").matches(".*(\\d)\\1{2,}.*") && (num2 + "").matches(".*(\\d)\\1{1,}.*")) {
		      return 1;
		    } else {
		      return 0;
		    }
		  }

}
