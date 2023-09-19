package com.numberproblems;
import java.util.*;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to check ?");
		int n = sc.nextInt();
		
			for(int i=1; i<=n; i++) {
				int z = sc.nextInt();
				if(z>1) {
					int count = 0;
					for(int t = 2; t*t<=z; t++) {
						if(z%t==0) {
							count++;
							break;
							}
					}
					if(count==0) {
						System.out.println(z+" is a prime number");
					}
					else {
						System.out.println(z+" is not prime number");
					}	
				}
				if(z<=1) {
					System.out.println(z+" is not Prime");
				}
			}
		
		
		// Closing the Scanner sc 
		sc.close();
	}
	
	
}