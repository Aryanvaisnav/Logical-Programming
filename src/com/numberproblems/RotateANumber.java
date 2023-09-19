package com.numberproblems;
import java.util.*;

public class RotateANumber {
	
	public static int rotateTheNumber(int n, int k) {
		int rotate = 0;
		int z =n;
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}

		if(k==0) {
			System.out.println(z);
		}
		
		if(k>0) {
			k = k % count; // For k > 5
			for(int i = 1; i<=k; i++) {
				int d = z % (10 * (int) Math.pow(10, i-1)) ;
				//System.out.println(d);
				int b = z/ (10 * (int) Math.pow(10, i-1));
				//System.out.println(b);
				rotate = d * (int) Math.pow(10, count-i) +b;
			}
			// System.out.println(rotate);
			
		}
		
		if(k<0) {
			k = k + count; // for k < -6;
			for(int i = 1; i<=k; i++) {
				int d = z % (10 * (int) Math.pow(10, i-1)) ;
				//System.out.println(d);
				int b = z/ (10 * (int) Math.pow(10, i-1));
				//System.out.println(b);
				rotate = d * (int) Math.pow(10, count-i) +b;
			}
			// System.out.println(rotate);
			
		}
		return rotate;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("How much you want to rotate");
		int k = sc.nextInt();
		System.out.println(rotateTheNumber(n, k));
		
		sc.close();
	}

}
