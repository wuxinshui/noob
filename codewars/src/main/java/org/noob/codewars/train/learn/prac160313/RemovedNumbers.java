package org.noob.codewars.train.learn.prac160313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A friend of mine takes a sequence of numbers from 1 to n (where n > 0).
 * Within that sequence, he chooses two numbers, a and b. He says that the
 * product of a and b should be equal to the sum of all numbers in the sequence,
 * excluding a and b. Given a number n, could you tell me the numbers he
 * excluded from the sequence? The function takes the parameter: n (don't worry,
 * n is always strictly greater than 0 and small enough so we shouldn't have
 * overflow) and returns an array of the form:
 * 
 * [(a, b), ...] or [[a, b], ...] or {{a, b}, ...} with all (a, b) which are the
 * possible removed numbers in the sequence 1 to n.
 * 
 * [(a, b), ...] or [[a, b], ...] or {{a, b}, ...} will be sorted in increasing
 * order of the "a".
 * 
 * It happens that there are several possible (a, b). The function returns an
 * empty array if no possible numbers are found which will prove that my friend
 * has not told the truth!
 * 
 * Examples:
 * 
 * removNb(26) should return { {15, 21}, {21, 15} } removNb(100) should return
 * an array of size 0
 * 
 * @author Administrator
 *
 */
public class RemovedNumbers {

	public static void main(String[] args) {
		RemovedNumbers numbers = new RemovedNumbers();
		int n = 26;
		List<long[]> list=numbers.removNb(n);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(Arrays.toString(list.get(i)));
		}
		System.out.println(15 * 21);
	}

	public static List<long[]> removNb(long n) {
		// your code
		List<long[]> result = new ArrayList<>();
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i * j-(sum - i - j) ==0) {
					long[] ls = new long[] { i, j };
					result.add(ls);
				}
			}
		}
		return result;
	}

}
