package org.primenumber.demo;

public class PrimeNumberRecursion {
	static int i = 2;

	public static void main(String[] args) {
		if (isPrime(29))
			System.out.println("Number is Prime");
		else
			System.out.println("Number is Not Prime");
	}

	public static boolean isPrime(int n) {

		if (i == n / 2 + 1)
			return true;
		if (n % i == 0)
			return false;
		i++;
		return isPrime(n);

	}

}
