package org.removewhitespaces.demo;

import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine(); // Initialize the String

		str = str.replaceAll("\\s", "");

		System.out.println("After Removing Whitespaces the entered string is:" + str);
	}
}
