package com.numberproblems;

import java.util.Scanner;

public class CheckNeonNumber {

	public static boolean checkNeonNumber(int n) {
		int square = n * n;
		int sum = 0;
		while (square > 0) {
			int d = square % 10;
			sum = sum + d;
			square = square / 10;
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		System.out.println(checkNeonNumber(n));

		if (checkNeonNumber(n) == true) {
			System.out.println(n + " is a Neon Number");
		} else {
			System.out.println(n + " is not a Neon Number");
		}

		sc.close();
	}

}
