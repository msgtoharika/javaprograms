package com.test.programs;

public class TryCatch {

	public static void main(String[] args) {

		try
		{
		    System.out.println("try block");
		 
		    throw new NullPointerException("Null occurred");
		} 
		finally
		{
		    System.out.println("finally block");
		}

	}

}
