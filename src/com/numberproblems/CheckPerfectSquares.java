package com.numberproblems;
import java.util.*;

public class CheckPerfectSquares {
	
	public static boolean checkperfectSquares(int n) {
		int count  = 0;
		for(int i = 1; i<=n; i++) {
			if(i * i == n) {
				count++;
			}	
		}
		
		if(n<1) {
			return false;
		}
		if(count==1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.print(checkperfectSquares(n));
		
		sc.close();
	}

}
