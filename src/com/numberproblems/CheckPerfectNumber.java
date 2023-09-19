package com.numberproblems;
import java.util.*;

public class CheckPerfectNumber {
	
	public static boolean checkPerfectNumbers(int n) {
		int sum = 0;
		for(int i = 1; i<n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
				sum = sum + i;
			} 
		}
		System.out.println();
		System.out.println("Output");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Sum of factors: " + sum);
		if(n<1) {
			return false;
		}
		if(sum == n) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		
		System.out.println(checkPerfectNumbers(n));
		
		sc.close();
		
	}

}
