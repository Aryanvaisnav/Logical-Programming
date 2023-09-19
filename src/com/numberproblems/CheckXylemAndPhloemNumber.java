package com.numberproblems;

import java.util.Scanner;

public class CheckXylemAndPhloemNumber {

	public static boolean checkXylemAndPhleomNumber(int n) {
		int e1 = n % 10; // first extreme

		int x = n;

		// reverse the original number

		int sum = 0;
		while (x > 0) {
			int rev1 = x % 10;
			sum = sum * 10 + rev1;
			x = x / 10;
		}

		int e2 = sum % 10; // second extreme

		int m1 = n / 10; // modified number 

		// reverse the modified number

		int sum2 = 0;
		while (m1 > 0) {
			int rev2 = m1 % 10;
			sum2 = sum2 * 10 + rev2;
			m1 = m1 / 10;
		}

		int m2 = sum2 / 10; // Mean elements number

		int sum3 = 0;
		while (m2 > 0) {
			int d = m2 % 10;
			sum3 = sum3 + d; // sum3 = sum of mean
			m2 = m2 / 10;
		}

		int e = e1 + e2; // Sum of extreme

		if (e == sum3) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		if (checkXylemAndPhleomNumber(n) == true) {
			System.out.println(n + " is a Xylem Number");
		} else {
			System.out.println(n + " is a Phleom Number");
		}

		sc.close();

	}

}
