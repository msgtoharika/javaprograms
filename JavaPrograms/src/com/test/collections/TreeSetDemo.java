package com.test.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(20);
		ts.add(0);
		ts.add(30);
		ts.add(5);
		ts.add(15);
		System.out.println(ts);
		

	}

}
