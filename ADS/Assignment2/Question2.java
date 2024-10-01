package org.question2.demo;

import java.util.Arrays;

public class Question2 {

	public static int removeduplicates(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[n - 1];

		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 2 };
		int a1[] = { 0, 0, 1, 1, 2, 2, 3, 3 };
		int n1 = a1.length;
		int n = a.length;
		n = removeduplicates(a, n);
		n1 = removeduplicates(a1, n1);
		System.out.println("Output : " + n);
		System.out.println("Output : " + n1);
	}

}
