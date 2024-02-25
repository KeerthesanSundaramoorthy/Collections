package com.Hash;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHash {
	public static void main(String [] args) {
//		LinkedHashSet<String> set = new LinkedHashSet();
//		set.add("San");
//		set.add("Logesh");			//ip order is same as output order
//		set.add("Santhosh");
//		set.add("Kee");
//		set.add("San");			//do not allow duplicates
//
//		System.out.println(set);
		
		LinkedHashSet<Integer> set = new LinkedHashSet();
		set.add(1000);
		set.add(63);			//ip order is same as output order
		set.add(96);
		set.add(01);
		set.add(63);			//do not allow duplicates
		set.add(50);	
		System.out.println(set);		
	}
}
