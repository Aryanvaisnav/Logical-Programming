package com.numberproblems;

import java.util.Scanner;

public class CheckHappyNumber {

	public static boolean checkHappyNumber(int n) {
		int sum = 0;
		int x = n;
		int z = n;
		while(x > 0) {
			sum = 0;
			while (z > 0) {
				int d = z % 10;
				sum = sum + (int) Math.pow(d, 2);
				z = z / 10;
			}
			z = sum;
			if(sum == 1) {
				return true;
			}
			x--;		
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();

		if (checkHappyNumber(n) == true) {
			System.out.println(n + " is a Happy Number");
		} 
		else {
			System.out.println(n + " is not a Happy Number");
		}

		sc.close();

	}

}
