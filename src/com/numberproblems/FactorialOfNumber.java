package com.numberproblems;
import java.util.*;

public class FactorialOfNumber {
	
	public static int fact(int n) {
		int pro = 1;
		for(int i = 1; i<=n ; i++) {
			pro = pro*i;  	
		}
		return pro;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
		
		sc.close();
	}

}
