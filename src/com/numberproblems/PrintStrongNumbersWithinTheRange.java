package com.numberproblems;

import java.util.Scanner;

public class PrintStrongNumbersWithinTheRange {

	public static void printStrongNumbers(int a, int b) {

		if (a >= 0 && b > 0 && b > a) {

			System.out.println("Strong Numbers between " + a + " and " + b + " are : ");

			for (int i = a; i <= b; i++) {

				if (i > 0) {
					int n = i;
					int sum = 0;
					int pro = 1;
					while (n > 0) {
						int d = n % 10;
						pro = 1;
						while (d > 0) {
							pro = pro * d;
							d--;
						}
						sum = sum + pro;
						n = n / 10;
					}
					if (i == sum) {
						System.out.print(sum + " ");
					}

				}

			}

		} else {
			System.out.print("Invalid Range");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value: ");
		int a = sc.nextInt();
		System.out.print("Enter the last value: ");
		int b = sc.nextInt();

		printStrongNumbers(a, b);

		sc.close();

	}

}
