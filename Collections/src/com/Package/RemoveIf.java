package com.Package;

import java.util.ArrayList;

public class RemoveIf {
	public static void main(String [] args) {
//		ArrayList<Integer> set = new ArrayList<>();
//		set.add(1000);
//		set.add(63);			
//		set.add(96);
//		set.add(01);
//		set.add(63);			
//		set.add(50);	
//		System.out.println(set);
//		set.removeIf(s->s.equals(50));
//		System.out.println(set);
//		
		
		ArrayList<String> set = new ArrayList<>();
		set.add("San");
		set.add("Keee");			
		set.add("Logesh");
		set.add("Santhosh");
		set.add("Horse");			
		set.add("God");	
		System.out.println(set);
		set.removeIf(s->s.contains("Horse"));
		System.out.println(set);
	}
}
