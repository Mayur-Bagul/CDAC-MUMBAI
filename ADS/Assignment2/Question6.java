package org.splitwords.demo;

public class Question6 {

	public static String reverse(String s) {
		// Finding the index of the whitespaces
		int x = s.indexOf(" ");

		// Base condition
		if (x == -1)
			return s;

		// Recursive call
		return reverse(s.substring(x + 1)) + " " + s.substring(0, x);
	}

	public static void main(String[] args) {
		String str = "Hello World";
		String rev = reverse(str);
		System.out.println("Reversed sentence: " + rev);

		String str1 = "Java Programming";
		String rev1 = reverse(str1);
		System.out.println("Reversed sentence: " + rev1);

	}
}
