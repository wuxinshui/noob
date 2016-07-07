package org.noob.codewars.train.learn.prac160316;

public class Diamond {

	public static void main(String[] args) {
		int n = 11;
		// System.out.println(print(n));
		System.out.println(print1(n));
		// StringBuilder builder=new StringBuilder();
		// builder.append("@@@*\n");
		// builder.append("@@***\n");
		// builder.append("@*****\n");
		// builder.append("*******\n");
		// builder.append("@*****\n");
		// builder.append("@@***\n");
		// builder.append("@@@*\n");
		// System.out.println(builder);
	}

	public static String print(int n) {
		if (n % 2 == 0 || n < 2) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		int step = n / 2;
		for (int i = 1; i <= (step + 1); i++) {
			for (int j = 1; j <= (step - i + 1); j++) {
				builder.append(" ");
			}
			for (int k = 1; k <= (i * 2 - 1); k++) {
				builder.append("*");
			}
			builder.append("\n");
		}
		for (int i = 1; i <= step; i++) {
			for (int j = 1; j <= i; j++) {
				builder.append(" ");
			}
			for (int k = 1; k <= (n - i * 2); k++) {
				builder.append("*");
			}
			builder.append("\n");
		}
		return builder.toString();
	}


	public static String print1(int n) {
		if (n < 0 || n % 2 == 0)
			return null;
		String shape = "";
		int midRow = n / 2 + 1;
		for (int i = midRow; i <= n * 2 - midRow; i++) {
			for (int j = 1; j <= n - Math.abs(n - i); j++) {
				if (j <= Math.abs(n - i))
					shape += " ";
				else
					shape += "*";
			}
			shape += "\n";
		}
		return shape;
	}

	public static String print2(int n) {
		if (n % 2 == 0 || n < 0) {
			return null;
		}
		StringBuilder diamond = new StringBuilder();
		for (int i = 1; i <= n; i += 2) {
			appendLine(diamond, i, n);
		}
		for (int i = n - 2; i > 0; i -= 2) {
			appendLine(diamond, i, n);
		}
		return diamond.toString();
	}

	private static void appendLine(StringBuilder diamond, int size, int totalSize) {
		int spaces = (totalSize - size) / 2;
		for (int j = 0; j < spaces; j++) {
			diamond.append(" ");
		}
		for (int j = 0; j < size; j++) {
			diamond.append("*");
		}
		diamond.append("\n");
	}

}
