package com.numberproblems;

import java.util.Scanner;

public class PrintNeonNumbersWithinRange {

	public static void printNeonNumbers(int a, int b) {

		if (a >= 0 && b > 0 && b > a) {

			System.out.println("Neon Numbers between " + a + " and " + b + " are : ");

			for (int i = a; i <= b; i++) {
				int square = i * i;
				int sum = 0;

				while (square > 0) {
					int d = square % 10;
					sum = sum + d;
					square = square / 10;
				}
				if (i == sum) {
					System.out.print(sum + " ");
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

		printNeonNumbers(a, b);

		sc.close();

	}

}
