package org.reversestring.demo;

import java.io.*;

public class Question4 {
	public static String reverse(String str) {

		if (str.isEmpty())

			return str;
		else {

			char ch = str.charAt(0);

			return reverse(str.substring(1)) + ch;
		}
	}

	public static void main(String[] args) {

		String str = "hello";

		String rev_str = reverse(str);

		System.out.println("Sentence in reversed form is : " + rev_str);

		String str2 = "Java";

		String rev_str2 = reverse(str2);

		System.out.println("Sentence in reversed form is : " + rev_str2);
	}
}
