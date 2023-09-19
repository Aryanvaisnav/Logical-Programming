package com.numberproblems;

import java.util.Scanner;

public class PrintTheAutomorphicNumbersWithinRange {

	public static void printAutomorphicNumbers(long a, long b) {

		if (a >= 0 && b > 0 && b > a) {

			System.out.println("Automorphic Numbers between " + a + " and " + b + " are : ");

			for (long i = a; i <= b; i++) {
				long d = 0;
				long square = i * i;
				long z = i;
				long count = 0;
				while (z > 0) {
					z = z / 10;
					count++;
				}

				d = square % (long) Math.pow(10, count);
				if (i == d) {
					System.out.print(d + " ");
				}

			}

		} else {
			System.out.println("Invalid Range");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value: ");
		long a = sc.nextLong();
		System.out.print("Enter the last value: ");
		long b = sc.nextLong();

		printAutomorphicNumbers(a, b);

		sc.close();
	}

}
