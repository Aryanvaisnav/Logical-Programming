package com.numberproblems;

import java.util.*;

public class PrintPrimeNumbersBetweenARange {

	public static void printPrimeNumbers(int low, int high) {

		if (low >= 0 && high > 0 && high > low) {

			System.out.println("Prime Numbers between " + low + " and " + high + " are : ");

			for (int i = low; i <= high; i++) {
				int count = 0;
				for (int n = 1; n <= i; n++) {
					if (i % n == 0) {
						count++;
					}
				}

				if (count == 2) {
					System.out.print(i + " ");
				}

			}

		} else {
			System.out.println("Invalid Range");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value: ");
		int low = sc.nextInt();
		System.out.print("Enter the last value: ");
		int high = sc.nextInt();
		printPrimeNumbers(low, high);

		// Closing Scanner Class
		sc.close();
	}

}