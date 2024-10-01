package org.reversenumber.demo;

import java.util.Scanner;

public class Question7 {
	int rev;

	int reverse(int num) {
		if (num == 0)
			return rev;
		else {
			rev = ((rev * 10) + (num % 10));
			return reverse(num / 10);
		}
	}

	public static void main(String[] args) {
		Question7 obj = new Question7();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int result = obj.reverse(num);
		System.out.println("Result : " + result);

	}
}


/* Input  :  12345
 * Output :  54321
 * 
 * obj.revese(12345)
 * 
 * rev = (0*10)+12345%10
 * rev = 5
 * reverse = (5*10)+1234%10
 * rev = 54
 * reverse = (54*10)+123%10
 * rev = 543
 * reverse = (543*10)+12%10
 * rev = 5432
 * reverse = (5432*10)+1%10
 * rev = 54321
 * reverse(0)
 * 
 * 
 * 
 * */
 