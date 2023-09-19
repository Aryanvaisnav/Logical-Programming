package com.numberproblems;
import java.util.*;

//Write a function that calculates the Greatest Common Divisor & LCM of 2 numbers.

public class GCDAndLCM {
	
	public static String gcd(int a, int b) {
		int gcd = 1;
		for(int i = 1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		int lcm = (a*b)/gcd; 
		return "[ GCD: "+gcd+", LCM: "+lcm+" ]";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.print(gcd(a,b));
		
		
		// Closing the Scanner
				sc.close();
		
	}
	
}
			
			
			
		
		
		
	



