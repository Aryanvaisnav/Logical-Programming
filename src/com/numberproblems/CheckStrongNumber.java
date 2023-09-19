package com.numberproblems;

import java.util.Scanner;

public class CheckStrongNumber {

	public static boolean checkStrongNumber(int n) {

		if (n > 0) {

			int z = n;
			int sum = 0;
			int pro = 1;
			while (z > 0) {
				int d = z % 10;
				pro = 1;
				while (d > 0) {
					pro = pro * d;
					d--;
				}
				// System.out.println(pro);
				sum = sum + pro;
				z = z / 10;
				// System.out.println(sum);
			}
			if (n == sum) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		if (checkStrongNumber(n) == true) {
			System.out.println(n + " is a Strong Number");
		} else {
			System.out.println(n + " is not a Strong Number");
		}

		sc.close();

	}

}
