package com.numberproblems;
import java.util.*;

public class ReverseANumber {
	
	// Method - 1
	public static int reverseTheNumberMethod1(int n) {
		int z = n;
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		System.out.println("Count of the digit is "+count);
		int sum2 = 0;
		double sum = 0;
		for( int i = count-1; i>=0; i--) {
			double digit = z%10 * Math.pow(10,i);
			z = z/10;
			sum = sum + digit;
			sum2 = (int) sum;
			
			
		}
		return sum2;
		
	}
	
	// Method - 2
	public static int reverseTheNumberMethod2(int n) {
		int reverse = 0;
		while(n>0) {
			int remainder = n%10;
			reverse = reverse*10 + remainder;
			n = n/10;
		}
		return reverse;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(reverseTheNumberMethod2(n));
		
		sc.close();
	}
}