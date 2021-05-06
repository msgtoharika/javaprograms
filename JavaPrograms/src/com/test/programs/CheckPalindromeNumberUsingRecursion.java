package com.test.programs;

public class CheckPalindromeNumberUsingRecursion {
	
	
	public static void main(String[] args) {
		int n = 543;
		System.out.println(revNum(n, 0));

	}

	private static int revNum(int n, int temp) {
		
		if(n==0) {
			return temp;
		}else {	
			temp = temp*10 + n%10;
			System.out.println("temp-------->"+temp);
			return revNum(n/10, temp);
			
		}
		
	}

}
