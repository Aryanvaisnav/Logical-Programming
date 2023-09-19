package com.numberproblems;
import java.util.*;

public class NatureOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of data which you want to enter");
		int n = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Enter the "+i+" th "+" number ");
			int z = sc.nextInt();	
			if(z>0) {
					//System.out.println("Number is Positive");
					count1++;
					}else if(z<0) {
						//System.out.println("Number is negative");
						count2++;
					}else {
						//System.out.println("Number is zero");
						count3++;
					}
		}
		System.out.println("Count of Possitive " + count1++);
		System.out.println("Count of Negative "+ count2++);
		System.out.println("Count of Zeroes "+ count3++);
		
		// Closing the Scanner sc 
		sc.close();
	}

}
