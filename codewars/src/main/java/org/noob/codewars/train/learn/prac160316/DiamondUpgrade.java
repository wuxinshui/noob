package org.noob.codewars.train.learn.prac160316;

public class DiamondUpgrade {

	public static void main(String[] args) {
		// String string="a\n";
		// string=string+"aa\n";
		// System.out.println(string);
		int n = 11;
		System.out.println(print(n));
	}

	public static String print(int n) {
		if (n % 2 == 0 || n < 2) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		int step = n / 2;

		for (int i = 1; i <= (step + 1); i++) {
			prcom(builder,step - i + 1, i * 2 - 1);
			builder.append("\n");
		}
		for (int i = 1; i <= step; i++) {
			prcom(builder,i, n - i * 2);
			builder.append("\n");
		}
		return builder.toString();
	}

	public static void prcom(StringBuilder  builder,int first, int second) {
		for (int j = 1; j <= first; j++) {
			builder.append(" ");
		}
		for (int k = 1; k <= second; k++) {
			builder.append("*");
		}
	}

}
