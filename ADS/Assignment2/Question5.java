package org.reversearrayplace.demo;

import java.util.Scanner;

public class Question5 {

	public static void reverse(int arr[], int start, int end) {

		int temp;

		// If start index is greater than end index
		if (start >= end)
			return;

		// Logic to swap values
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		// Recursively call
		reverse(arr, start + 1, end - 1);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int n = in.nextInt();

		// Declare an array
		int arr[] = new int[n];

		System.out.println("Enter an array values");

		// Input array values
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		reverse(arr, 0, n - 1);

		System.out.println("Reverse of an array is ");

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
