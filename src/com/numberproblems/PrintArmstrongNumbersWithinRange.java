package com.numberproblems;

import java.util.Scanner;

public class PrintArmstrongNumbersWithinRange {

	public static void printArmstrongNumbers(int a, int b) {

		if (a >= 0 && b > 0 && b > a) {

			System.out.print("Armstrong Numbers between " + a + " and " + b + " are : ");

			int count = 0;
			for (int i = a; i <= b; i++) {

				int x = i;
				count = 0;
				while (x > 0) {
					x = x / 10;
					count++;
				}

				int y = i;
				int n = 0; // n is an Armstrong Number

				while (y > 0) {
					int remainder = y % 10;
					n = n + (int) Math.pow(remainder, count);
					y = y / 10;
				}
				if (i == n) {
					System.out.print(n + " ");

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

		printArmstrongNumbers(a, b);

		sc.close();

	}

}
