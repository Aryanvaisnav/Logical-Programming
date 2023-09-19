package com.numberproblems;

import java.util.Scanner;

public class PrintPerfectNumbersWithinRange {

	public static void printPerfectNumbers(int a, int b) {
		int sum = 0;
		if (a >= 0 && b > 0 && a < b) {

			System.out.println("Perfect Numbers between " + a + " and " + b + " are : ");

			for (int i = a; i <= b; i++) {
				sum = 0;
				for (int j = 1; j < i; j++) {
					if (i % j == 0) {
						sum = sum + j;
					}
				}
				if (sum == i) {
					System.out.print(i + "  ");
				}

			}

		} else {
			System.out.println("Invalid Range");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value: ");
		int a = sc.nextInt();
		System.out.print("Enter the last value: ");
		int b = sc.nextInt();

		printPerfectNumbers(a, b);

		sc.close();

	}

}
