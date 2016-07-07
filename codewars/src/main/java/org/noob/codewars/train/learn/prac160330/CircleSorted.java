package org.noob.codewars.train.learn.prac160330;

/**
 * Write a method, isCircleSorted(int[] A) (Java, JavaScript), or
 * Array#circularly_sorted? (Ruby) that determines if A is circularly sorted. An
 * Array is circularly sorted if the elements are sorted in ascending order, but
 * displaced, or rotated, by any number of steps.
 * 
 * For Example: // True: isCircleSorted([2,3,4,5,0,1]);
 * isCircleSorted([4,5,6,9,1]); isCircleSorted([10,11,6,7,9]);
 * isCircleSorted([1,2,3,4,5]); isCircleSorted([5,7,43,987,-9,0]);
 * 
 * // False: isCircleSorted([4,1,2,5]); isCircleSorted([8,7,6,5,4,3]);
 * isCircleSorted([6,7,4,8]); isCircleSorted([7,6,5,4,3,2,1]);
 * 
 * TODO Review 学习解题思路
 */
public class CircleSorted {

	public static void main(String[] args) {
		// int[] a = { 6, 7, 4, 8 };
		int[] a = { 4, 5, 6, 9, 1 };

		System.out.println(isCircleSorted(a));
		System.out.println(isCircleSorted1(a));
	}

	/**
	 * 判断a[i]>a[i+1]的次数，最多只能大于一次 循环完所有的值
	 * 
	 * @param a
	 * @return
	 */
	public static boolean isCircleSorted(int[] a) {
		int disorder = 0;
		for (int i = 0; i < a.length; ++i) {
			if (a[(i == 0 ? a.length : i) - 1] > a[i]) {
				++disorder;
			}
		}
		return disorder <= 1;
	}

	/**
	 * 判断a[i]>a[i+1]的次数，最多只能大于一次 只要有第二次的直接return false
	 * 
	 * @param a
	 * @return
	 */
	public static boolean isCircleSorted1(int[] a) {
		boolean pivot = false;
		for (int i = 0; i < a.length; i++) {
			System.out.println((i + 1) % a.length);
			if (a[i] > a[(i + 1) % a.length]) {
				if (pivot) {
					return false;
				} else {
					pivot = true;
				}
			}
		}
		return true;
	}

}
