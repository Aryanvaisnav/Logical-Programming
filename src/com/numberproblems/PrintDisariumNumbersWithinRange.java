package com.numberproblems;

import java.util.Scanner;

public class PrintDisariumNumbersWithinRange {

	public static void printDisariumNumber(int a, int b) {

		if (a >= 0 && b > 0 && b > a) {

			System.out.println("Disarium Number between " + a + " and " + b + " are : ");

			for (int i = a; i <= b; i++) {
				int x = i;
				int count = 0;
				while (x > 0) {
					x = x / 10;
					count++;
				}
				int y = i;
				int sum = 0;
				while (y > 0) {
					int d = y % 10;
					sum = sum + (int) Math.pow(d, count--);
					y = y / 10;
				}
				if (i == sum) {
					System.out.print(sum + " ");
				}

			}

		} else {
			System.out.println("Invalid Limit");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value: ");
		int a = sc.nextInt();
		System.out.print("Enter the last value: ");
		int b = sc.nextInt();

		printDisariumNumber(a, b);

		sc.close();

	}

}
