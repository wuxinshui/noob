package org.noob.thinking.chapter11.foreach;

import java.util.Arrays;

public class ArrayIsNotIterable {

	static <T> void test(Iterable<T> ib) {
		for (T t : ib) {
			System.out.print(t+" ");
		}
	}

	public static void main(String[] args) {
		
		test(Arrays.asList(1,2,3));
		String[] array={"A","B","C"};
		test(Arrays.asList(array));

	}

}
