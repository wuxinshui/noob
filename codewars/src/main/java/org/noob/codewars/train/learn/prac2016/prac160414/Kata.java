package org.noob.codewars.train.learn.prac2016.prac160414;

import java.util.Arrays;

public class Kata {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
		int[] arr = {20,10,30,10,10,15,35};
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 1)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1,3)));
		System.out.println(findEvenIndex(arr));
	}

	public static int findEvenIndex(int[] arr) {
		// your code
		int length=arr.length;
		for (int i = 1; i < length-2; i++) {
			int[] a1 = Arrays.copyOf(arr, i);
			int[] a2 = Arrays.copyOfRange(arr,(i+1),length);
			if (sum(a1)==sum(a2)) {
				return i;
			}
		}
		return -1;
	}
	
	public static int sum(int[] a){
		int result=0;
		for (int i = 0; i < a.length; i++) {
			result+=a[i];
		}
		return result;
	}

}
