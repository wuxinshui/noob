package org.noob.codewars.train.learn.prac2016.prac160329;

import java.math.BigDecimal;
/**
 * In mathematics, a Diophantine equation is a polynomial equation, usually in
 * two or more unknowns, such that only the integer solutions are sought or
 * studied.
 * 
 * In this kata we want to find all integers x, y (x >= 0, y >= 0) solutions of
 * a diophantine equation of the form
 * 
 * x ^ 2 - 4 * y ^ 2 = n where the unknowns are x and y and n is a given
 * positive number. Solutions x, y will be given as an array of arrays (Ruby,
 * Python, Clojure)
 * 
 * [[x1, y1], [x2, y2] ....] as an array of tuples (Haskell)
 * 
 * [(x1, y1), (x2, y2) ....] and as a string (Java, C#)
 * 
 * "[[x1, y1], [x2, y2] ....]" in decreasing order of the positive xi. If there
 * is no solution returns [] or "[]".
 * 
 * @author Administrator
 *
 *TODO 代码优化
 */
public class Dioph {

	public static void main(String[] args) {
		System.out.println(solEquaStr(90005));
	}

	public static String solEquaStr(long n) {
		StringBuilder builder = new StringBuilder("[");
		boolean flag=false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				BigDecimal result = BigDecimal.valueOf(i).pow(2)
						.subtract(BigDecimal.valueOf(j).pow(2).multiply(BigDecimal.valueOf(4)));
				if (n == result.longValue()) {
					builder.append("[" + i + ", " + j + "]");
					flag=true;
				}else{
					flag=false;
				}
			}
			if (flag) {
				builder.append(",");
			}
		}
		
		builder.append("]");
		return builder.toString();
	}
}
