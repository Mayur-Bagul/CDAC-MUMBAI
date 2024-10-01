package org.question10.demo;

import java.util.*;

public class Question10 {
	public static void Rotatetoleft(int[] arr, int n, int d) {
	    if (n == 0)
	      return;
	    d = d % n;
	    if (d > n)
	      return;
	    int[] temp = new int[d];
	    for (int i = 0; i < d; i++) {
	      temp[i] = arr[i];
	    }
	    for (int i = 0; i < n - d; i++) {
	      arr[i] = arr[i + d];
	    }
	    for (int i = n - d; i < n; i++) {
	      arr[i] = temp[i - n + d];
	    }
	  }
	  public static void main(String args[]) {
	    int n = 4;
	    int[] arr = {10,20,30,40};
	    int d = 1;
	    Rotatetoleft(arr, n, d);
	    System.out.println("After Rotating the elements to left ");
	    for (int i = 0; i < n; i++) {
	      System.out.print(arr[i] + " ");
	    }
	  }
	}
/*	public static void Rotatetoright(int[] arr, int n, int d) {
		if (n == 0)
			return;
		d = d % n;
		if (d > n)
			return;
		int[] temp = new int[d];
		for (int i = n - d; i < n; i++) {
			temp[i - n + d] = arr[i];
		}
		for (int i = n - d - 1; i >= 0; i--) {
			arr[i + d] = arr[i];
		}
		for (int i = 0; i < d; i++) {
			arr[i] = temp[i];
		}
	}

	public static void main(String args[]) {
		int n = 5;
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		Rotatetoright(arr, n, k);
		System.out.println("After Rotating the elements to right ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
*/