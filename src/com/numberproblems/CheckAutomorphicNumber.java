package com.numberproblems;

import java.util.Scanner;

public class CheckAutomorphicNumber {

	public static boolean checkAutomorphicNumber(long n) {
		long square = n * n;
		long z = n;
		long count = 0;

		while (z > 0) {
			z = z / 10;
			count++;
		}

		long d = square % (long) Math.pow(10, count);

		if (n == d) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		long n = sc.nextLong();

		System.out.println(checkAutomorphicNumber(n));

		if (checkAutomorphicNumber(n) == true) {
			System.out.println(n + " is an Automorphic Number");
		} else {
			System.out.println(n + " is not an Automorphic Number");
		}

		sc.close();

	}

}
