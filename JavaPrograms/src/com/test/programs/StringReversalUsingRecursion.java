package com.test.programs;

public class StringReversalUsingRecursion {

	public static void main(String[] args) {
		 String myString = "Hello Harika!!!!";
		 String rev = reverseString(myString);
		 System.out.println("reversed string is ---> "+rev);
		 

	}
	
	public static String reverseString(String str) {
		
		if(str.isEmpty()) {
			System.out.println("Input string is empty");
			return "";
		}else {
			
			System.out.println("String to be passed in Recursive Function: "+str.substring(1) + "===> char at first index "+str.charAt(0));
			return reverseString(str.substring(1)) + str.charAt(0);			
	
		}
		
		
		
		
	}

}
