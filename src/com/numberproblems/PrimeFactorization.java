package com.numberproblems;
import java.util.*;

public class PrimeFactorization {
	
	public static void primefactors(int n) {
		int z = n;
		System.out.print("Prime Factors: ");
		for(int i = 2; i<=n; i++) {
			while(n % i == 0) {
				n = n/i;
				System.out.print(i + "  ");
			}
		}
		if(z<2) {
			System.out.println(" No Prime Factors ");
		}
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		primefactors(n);
		
		
		sc.close();
	}

}
