package org.armstrongnumber.demo;

import java.util.Scanner;

public class ArmstrongNumberRecursion {
static int arm(int n) 
{
if(n<10)
return n*n*n;
return (n%10)*(n%10)*(n%10)+arm(n/10);
	}
public static void main(String args[]) {
 int num, r;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any Number");
	num=sc.nextInt();
	 r = arm(num);
	if(num==r)
		System.out.println(num + " Is an Armstrong number");
	else
		System.out.println(num + " Is not an Armstrong number");
}
}