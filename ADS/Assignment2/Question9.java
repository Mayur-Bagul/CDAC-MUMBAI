package org.palindromeornot.demo;

import java.util.Scanner;

public class Question9 {
	public static boolean isPalindrome(String str) {

		if (str.length() == 0 || str.length() == 1)
			return true;

		if (str.charAt(0) != str.charAt(str.length() - 1))
			return false;

		return isPalindrome(str.substring(1, str.length() - 1));
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String for check:");
		String string = sc.nextLine();

		if (isPalindrome(string))
			System.out.println(string + " is a palindrome");
		else
			System.out.println(string + " is not a palindrome");
	}

}
