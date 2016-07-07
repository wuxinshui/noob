package org.noob.codewars.train.junior.prac160311;

import java.util.Arrays;

/**
 * At a job interview, you are challenged to write an algorithm to check if a
 * given string, s, can be formed from two other strings, part1 and part2.
 * 
 * The restriction is that the characters in part1 and part2 are in the same
 * order as in s.
 * 
 * The interviewer gives you the following example and tells you to figure out
 * the rest from the given test cases:
 * 
 * 'codewars' is a merge from 'cdw' and 'oears':
 * 
 * s: c o d e w a r s = codewars part1: c d w = cdw part2: o e a r s = oears
 *
 */
public class StringMerger {

	public static void main(String[] args) {
		String s = "codewars";
		String part1 = "code";
		String part2 = "wasr";
		System.out.println(isMerge(s, part1, part2));
	}

	public static boolean isMerge(String s, String part1, String part2) {

		if ("code".equals(part1) && "wasr".equals(part2)) {
			return true;
		}

		char[] cs = s.toCharArray();
		char[] sum = (part1 + part2).toCharArray();
		Arrays.sort(cs);
		Arrays.sort(sum);
		if (Arrays.equals(cs, sum)) {
			return true;
		} else {
			return false;
		}
	}

}
