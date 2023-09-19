package com.numberproblems;

import java.util.Scanner;

public class PrintPalindromeNumbersWithinRange {

	public static void printPalindromeNumbers(int a, int b) {

		if (a >= 0 && b > 0 && b > a) {

			System.out.println("Palindrome Numbers between: " + a + " and " + b + " are : ");

			int rev = 0;
			for (int i = a; i <= b; i++) {
				rev = 0;
				for (int j = i; j > 0; j--) {
					while (j > 0) {
						int r = j % 10;
						rev = rev * 10 + r;
						j = j / 10;
					}
				}
				if (i == rev) {
					System.out.print(rev + "  ");
				}

			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value: ");
		int a = sc.nextInt();
		System.out.print("Enter the last value: ");
		int b = sc.nextInt();

		printPalindromeNumbers(a, b);

		sc.close();
	}

}
