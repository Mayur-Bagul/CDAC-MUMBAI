package org.fibonacci.demo;

import java.util.Scanner;

public class FibonacciSeriesRecursion {
	int fib(int m) {
		if (m == 0 || m == 1)
			return m;

		else
			return fib(m - 1) + fib(m - 2);
	}

	public static void main(String[] args) {

		FibonacciSeriesRecursion obj = new FibonacciSeriesRecursion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit");
		int x = sc.nextInt();
		System.out.println("Fibonacci series");
		for (int i = 0; i < x; i++)
			System.out.print(obj.fib(i) + ",");
	}

}
