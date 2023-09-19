package com.numberproblems;

import java.util.Scanner;

public class PrintHappyNumbersWithinRange {

	public static void printHappyNumbers(int a, int b) {

		if (a >= 0 && b > 0 && b > a) {

			System.out.println("Happy Numbers between " + a + " and " + b + " are : ");

			for (int i = a; i <= b; i++) {
				if (i > 0) {
					int n = i;
					int x = i;
					while (x > 0) {
						int sum = 0;
						while (n > 0) {
							int d = n % 10;
							sum = sum + (int) Math.pow(d, 2);
							n = n / 10;
						}
						n = sum;
						if (sum == 1) {
							System.out.print(i + " ");
							break;
						}
						x--;
					}

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

		printHappyNumbers(a, b);

		sc.close();

	}

}
