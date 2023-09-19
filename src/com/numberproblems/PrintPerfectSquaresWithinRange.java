package com.numberproblems;

import java.util.Scanner;

public class PrintPerfectSquaresWithinRange {

	public static void printPerfectSquares(int a, int b) {

		if (a >= 0 && b > 0 && b > a) {

			System.out.println("Perfect squares between " + a + " and " + b + " are : ");

			for (int i = a; i <= b; i++) {
				for (int j = 1; j <= i; j++) {
					if (j * j == i) {
						System.out.print(i + " ");
					}
				}

			}

		} else {
			System.out.println("Invalid Range");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start limit: ");
		int a = sc.nextInt();
		System.out.print("Enter the last limit: ");
		int b = sc.nextInt();

		printPerfectSquares(a, b);

		sc.close();
	}

}
