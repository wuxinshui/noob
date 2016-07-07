package org.noob.codewars.train.mid_level.prac160304;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays of strings a1 and a2 return a sorted array r in
 * lexicographical order and without duplicates of the strings of a1 which are
 * substrings of strings of a2.
 * 
 * Example 1:
 * 
 * a1 = ["arp", "live", "strong"]
 * 
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * 
 * returns ["arp", "live", "strong"]
 * 
 * Example 2:
 * 
 * a1 = ["tarp", "mice", "bull"]
 * 
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * 
 * returns []
 * 
 * @author Administrator
 *
 */
public class WhichArein {

	public static void main(String[] args) {
		// StringBuilder builder = new StringBuilder();
		// String string = builder.toString();
		// String[] strings = string.split(",");
		// Arrays.sort(strings);
		// System.out.println(Arrays.toString(strings));
		// System.out.println(strings.length);
		String a[] = new String[] { "arp1", "liv1e", "strong1" };
		String b[] = new String[] { "lively", "alive", "harp", "sharp", "alive", "harp", "sharp", "alive", "harp",
				"sharp", "alive", "harp", "sharp", "alive", "harp", "sharp", "alive", "harp", "sharp", "alive", "harp",
				"sharp", "alive", "harp", "sharp", "armstrong" };
		long start = System.currentTimeMillis();
		System.out.println(Arrays.toString(inArray(a, b)));
		// System.out.println(Arrays.toString(inArray1(a, b)));
		long end = System.currentTimeMillis();
		System.out.println("����ִ��ʱ��Ϊ��" + (end - start));

	}

	public static String[] inArray(String[] array1, String[] array2) {
		StringBuilder builder = new StringBuilder();
		boolean flag = false;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array2[j].contains(array1[i])) {
					builder.append(array1[i] + ",");
					flag = true;
					break;
				}
			}
		}
		if (!flag) {
			return new String[0];
		}
		String[] r = builder.toString().split(",");
		Arrays.sort(r);
		return r;
	}

	public static String[] inArray1(String[] array1, String[] array2) {
		Set<String> result = new HashSet<>();

		for (String a1 : array1) {
			for (String a2 : array2) {
				if (a2.contains(a1)) {
					result.add(a1);
					break;
				}
			}
		}

		String[] resultArray = result.toArray(new String[result.size()]);

		Arrays.sort(resultArray);

		return resultArray;
	}

	/**
	 * JDK8
	 * 
	 * @param array1
	 * @param array2
	 * @return
	 */
	// public static String[] inArray2(String[] array1,String[] array2){
	// return Arrays.stream(array1)
	// .filter(str ->
	// Arrays.stream(array2).anyMatch(s -> s.contains(str)))
	// .distinct()
	// .sorted()
	// .toArray(String[]::new);
	// }

}