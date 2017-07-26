package string;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @Description:
 * @Author:Wuxinshui
 * @Date:2017/5/17 18:33
 * 字符串分割
 */
//TODO write blog
public class SubString {

	public static void main(String[] args) {
		test1(generateString());
		test2(generateString());
	}

	private static void test1(String str) {
		long s=System.nanoTime();
		System.out.println(Arrays.toString(str.split(",")));
		long e=System.nanoTime();
		System.out.println("test1 cost "+(e-s)+"ns");
	}

	private static void test2(String str) {
		long s=System.nanoTime();
		StringTokenizer stringTokenizer=new StringTokenizer(str,",");
		while (stringTokenizer.hasMoreTokens()){
			System.out.print(stringTokenizer.nextToken());
		}
		System.out.println();
		long e=System.nanoTime();
		System.out.println("test2 cost "+(e-s)+"ns");

	}


	public static String generateString(){
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i <1000 ; i++) {
			sb.append(i);
			sb.append(",");
		}
		return sb.toString();
	}
}
