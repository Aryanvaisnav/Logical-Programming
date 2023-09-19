package com.numberproblems;

import java.util.Scanner;

public class SumOfAllOddNumbers {
	//Function-1
	public static int allOddNumbersSum(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			if(i%2!=0) {
				sum = sum+i;
			}
		}
		return  sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Sum of all odd numbers between 1 to"+" "+n+" "+"is"+" "+allOddNumbersSum(n));
		
		// Closing the Scanner
			sc.close();
	}

}
