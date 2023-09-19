package com.numberproblems;

import java.util.Scanner;

public class CheckArmstrongNumber {
	
	public static boolean checkArmstrongNumber(int n) {
		int z = n;
		int x = n;
		int count = 0;
		
		// Counting the digit
		
		while(n>0) {
			n = n / 10;
			count++;
		}
		
		// Getting the Armstrong number
		
		int a = 0;
		while(x > 0) {
			int remainder = x % 10;
			a = a + (int) Math.pow(remainder, count);
			x = x / 10;

		}
		return z == a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.print(checkArmstrongNumber(n));
		
		sc.close();

	}

}
