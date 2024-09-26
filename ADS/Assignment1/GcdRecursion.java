package org.gcd.demo;

import java.util.Scanner;

public class GcdRecursion {
	static int gcd(int a, int b) {
		if (a % b == 0)
			return b;
		return gcd(b, a % b);

	}

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		System.out.println("GCD : " + gcd(a, b));

	}

}
