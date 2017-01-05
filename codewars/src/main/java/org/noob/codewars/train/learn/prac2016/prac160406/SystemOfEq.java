package org.noob.codewars.train.learn.prac2016.prac160406;

/**
 * Vasya isn't really good at math. However, he wants to get a good mark for the
 * class. So he made a deal with his teacher.
 * "I wil study very hard and will be able to solve any given problem!" - Vasya
 * said.
 * 
 * Finally, today is the time to show what Vasya achieved. He solved the given
 * task immediately. Can you? You are given a system of equations: In JS, C# and
 * Java the parameters of the system: 1 ≤ n, m ≤ 1000 a^2+b=n a+b^2=m You should
 * count, how many there are pairs of integers (a, b) (0 ≤ a, b) which satisfy
 * the system.
 * 
 * Examples a^2+b=n a+b^2=m SystemOfEq.Solution(9,3) // => 1
 * SystemOfEq.Solution(14,28) // => 1 SystemOfEq.Solution(4,20) // => 0
 * 
 */
public class SystemOfEq {

	public static void main(String[] args) {
//		System.out.println(Math.pow(2, 2));
		int n = 400, m = 200;
		long s=System.currentTimeMillis();
//		System.out.println(Solution(n, m));
		System.out.println(Solution1(n, m));
		long e=System.currentTimeMillis();
		System.out.println("执行时间："+(e-s));
	}

	public static int Solution(int n, int m) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (Math.pow(i, 2) + j == n && Math.pow(j, 2) + i == m) {
					count++;
				}
			}
		}
		return count;
	}

	public static int Solution1(int n, int m) {
		int count = 0;
		for (int a = 0, b; a < Math.sqrt(n); a++) {
			if ((b = n - a * a) * b + a == m) {
				count++;
			}
		}
		return count;
	}

}
