package com.numberproblems;

import java.util.Scanner;

public class CheckDisariumNumber {

	public static boolean checkDisariumNumber(int n) {
		if (n >= 0) {
			int x = n;
			int y = n;
			int count = 0;
			while (x > 0) {
				x = x / 10;
				count++;
			}
			
			int sum = 0;
			while (y > 0) {
				int d = y % 10;
				sum = sum + (int) Math.pow(d, count--);
				y = y / 10;
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

		System.out.println(checkDisariumNumber(n));
		
		if(checkDisariumNumber(n) == true) {
			System.out.print(n + " is a Disarium Number");
		}
		else {
			System.out.println(n + " is not a Disarium Number");
		}

		sc.close();
	}

}
