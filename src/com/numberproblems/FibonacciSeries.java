package com.numberproblems;
import java.util.*;

public class FibonacciSeries {
	
	public static void printFibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		for(int i = 1; i<=n; i++) {
			System.out.print(a+" ");
			int c = a+b;
			a = b;
			b = c;	
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printFibonacciSeries(n);
		
		sc.close();
	}

}
