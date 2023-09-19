package com.numberproblems;
import java.util.*;

public class PythagoreanTriplets {
	
	public static boolean pythagoreanTriplets(int a, int b, int c) {
		int n = a>b ? a : b;
		int res = n>c ? n : c;
		int h = res;
		return Math.pow(h, 2) ==  Math.pow(a, 2) + Math.pow(b, 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print(pythagoreanTriplets(a, b, c));
		
		sc.close();

	}

}
