package com.numberproblems;
import java.util.*;

public class CheckPalindromeNumber {
	
	public static boolean checkPalindromeNumber(int n) {
		int reverse = 0;
		int z = n;
		while(n>0) {
			int remainder = n%10;
			reverse = reverse*10 + remainder;
			n = n/10;
		}
		
		return z == reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = sc.nextInt();
		System.out.println(checkPalindromeNumber(n));
		
		sc.close();
	}

}
