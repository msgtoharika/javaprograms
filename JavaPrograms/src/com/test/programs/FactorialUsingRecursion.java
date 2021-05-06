package com.test.programs;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));

	}
	
	public static int factorial(int n) {
		if(n<=1) {
			return n;
		}else {
			return n*factorial(n-1);
		}
		
		
	}

}
