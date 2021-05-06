package com.test.programs;

public class StringBufferAndBuilde {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");  
		System.out.println(sb.substring(1, 3));
		sb.append("Java"); 
		System.out.println(sb);
		System.out.println(sb.substring(1));
		
		System.out.println(sb.length());
		
	}

}
