package org.patternque1.demo;

import java.lang.String;
import java.util.Scanner;

public class Question1 {

	
	public static String func(int n) {
	
		if (n <= 0) {
			return "";
		}
		String res = func(n - 1);
		res = res + "*";
		System.out.println(res);
		return res;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		func(n);
	}

}

/*
 * public static void main(String[] args)
 * 
 * { int i, j, n; System.out.print("Input number of rows : "); Scanner sc = new
 * Scanner(System.in); n = sc.nextInt();
 * 
 * for (i = 1; i <= n; i++) { for (j = 1; j <= i; j++) System.out.print("*");
 * 
 * System.out.println(""); } }
 */