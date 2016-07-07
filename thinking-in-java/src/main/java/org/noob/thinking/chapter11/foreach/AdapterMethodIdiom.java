package org.noob.thinking.chapter11.foreach;

import java.util.Arrays;

public class AdapterMethodIdiom {

	public static void main(String[] args) {
		ReversibleArrayList<String> ral=new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
		System.out.println("deafult foreach");
		for (String string : ral) {
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println("revsered foreach");
		for(String string:ral.reversed()){
			System.out.print(string+" ");
		}
	}

}
