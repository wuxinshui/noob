package org.noob.codewars.train.mid_level.prac160303;

/**
 * Given 2 strings, a and b, return a string of the form:
 * shorter+reverse(longer)+shorter.
 * 
 * In other words, the shortest string has to be put as prefix and as suffix of
 * the reverse of the longest.
 * 
 * Strings a and b may be empty, but not null (In C# strings may also be null.
 * Treat them as if they are empty.). If a and b have the same length treat a as
 * the longer producing b+reverse(a)+b
 * 
 * @author Administrator
 *
 */
public class ReverseLonger {

	public static void main(String[] args) {
		String a = "acd";
		String b = "f";
		System.out.println(shorterReverseLonger(a, b));
	}

	public static String shorterReverseLonger(String a, String b) {

		if (a.length() >= b.length()) {
			return b + new StringBuffer(a).reverse().toString() + b;
		} else {
			return a + new StringBuffer(b).reverse().toString() + a;
		}
	}
	
	 public static String shorterReverseLonger1(String a, String b) {
		    String shorter = (a.length() < b.length()) ? a : b;
		    String longer = (a.length() < b.length()) ? b : a;
		    return shorter + reverse(longer) + shorter;
		  }
		  
		  private static String reverse(String s) {
		    return new StringBuilder(s).reverse().toString();
		  }

}
