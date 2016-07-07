package org.noob.codewars.train.learn.prac160317;

/**
 * Given an array, find the int that appears an odd number of times.
 * 
 * There will always be only one integer that appears an odd number of times.
 * 
 * @author Administrator
 *
 */
public class FindOdd {
	public static void main(String[] args) {
//		int[] A = new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 };
		int[] A=new int[]{1,1,2,-2,5,2,4,4,-1,-2,5};
//		System.out.println(findIt(A));
		System.out.println(findIt1(A));
	}

	public static int findIt(int[] A) {
		int odd = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j]) {
					odd++;
				}
			}
			if (odd % 2 == 1) {
				return A[i];
			}
		}
		return odd;
	}
	
	public static int findIt1(int[] A) {
	    int xor = 0;
	    for (int i = 0; i < A.length; i++) {
	      xor ^= A[i];
	      System.out.println(xor);
	    }
	    return xor;
	  }
}
