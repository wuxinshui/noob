package org.noob.codewars.train.learn.prac2016.prac160314;

/**
 * Some numbers have funny properties. For example:
 * 
 * 89 --> 8¹ + 9² = 89 * 1
 * 
 * 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
 * 
 * 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51 Given a positive
 * integer n written as abcd... (a, b, c, d... being digits) and a positive
 * integer p we want to find a positive integer k, if it exists, such as the sum
 * of the digits of n taken to the successive powers of p is equal to k * n. In
 * other words:
 * 
 * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) +
 * ...) = n * k If it is the case we will return k, if not return -1.
 * 
 * Note: n, p will always be given as strictly positive integers.
 * 
 * digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1 digPow(92, 1)
 * should return -1 since there is no k such as 9¹ + 2² equals 92 * k
 * digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
 * digPow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 =
 * 46288 * 51
 * 
 * @author Administrator
 *
 */
public class DigPow {

	public static void main(String[] args) {
		int n = 46288;
		int p = 3;
		System.out.println(digPow(n, p));
		System.out.println(digPow1(n, p));
	}

	public static long digPow(int n, int p) {
		// 1.每个位数的数字 转为字符串
		String str = String.valueOf(n);
		char[] cs = str.toCharArray();
		Double sum = 0.00;
		for (int i = 0; i < cs.length; i++) {
			int temp = Integer.parseInt(String.valueOf(cs[i]));
			// 2.每个位数的多次方相加
			sum += Math.pow(temp, p);
			p++;
		}
		// 3.判断是否相等
		int result = sum.intValue();
		if (sum.intValue() % n == 0) {
			return result / n;
		}
		return -1;
	}
	
	/**
	 * 知识点
	 * 1.Character.getNumericValue(intString.charAt(i)
	 * 2.(sum%n==0)?sum/n:-1
	 */
	public static long digPow1(int n,int p){
		String intString=String.valueOf(n);
		long sum=0;
		for(int i=0;i<intString.length();++i,++p){
			sum+=Math.pow(Character.getNumericValue(intString.charAt(i)), p);
		}
		return (sum%n==0)?sum/n:-1;
	}
	
}
