package org.noob.codewars.train.mid_level.prac160301;

/**
 * Description:
 * 
 * This time no story, no theory. The examples below show you how to write
 * function accum:
 * 
 * Examples:
 * 
 * accum("abcd") --> "A-Bb-Ccc-Dddd" accum("RqaEzty") -->
 * "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy" accum("cwAt") --> "C-Ww-Aaa-Tttt" The
 * parameter of accum is a string which includes only letters from a..z and
 * A..Z.
 * 
 * @author Administrator
 *
 */
public class Mumbling {

	public static void main(String[] args) {

	}

	public static String accum(String s) {
		// your code
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String str = String.valueOf(c).toLowerCase();
			String upper = str.toUpperCase();
			String lower = "";
			int j = i + 1;
			if (j == 1) {
				upper = str.toUpperCase();
				result = upper;
				continue;
			}
			if (j > 1) {
				while (j > 1) {
					lower = lower + str;
					j--;
				}
				upper = upper + lower;
			}
			result = result + "-" + upper;
		}
		return result;
	}

	/**
	 * TODO review point bldr.append('-');
	 * 
	 * @param s
	 * @return
	 */
	public static String accum1(String s) {
		StringBuilder bldr = new StringBuilder();
		int i = 0;
		for (char c : s.toCharArray()) {
			if (i > 0)
				bldr.append('-');
			bldr.append(Character.toUpperCase(c));
			for (int j = 0; j < i; j++)
				bldr.append(Character.toLowerCase(c));
			i++;
		}
		return bldr.toString();
	}

}
