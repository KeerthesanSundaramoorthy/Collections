package com.Hash;

import java.util.HashSet;
public class Hash {
	public static void main(String [] args) {
//		HashSet<String> set = new HashSet();
//		set.add("San");
//		set.add("Logesh");				//ip order is not same as output order
//		set.add("Sathosh");
//		set.add("Kee");
//		set.add("San");			//don't allow duplicates
//		System.out.println(set);
//		set.removeIf(s->s.contains("San"));
//		System.out.println(set);
		
		HashSet<Integer> set = new HashSet();
		set.add(1000);
		set.add(63);			//ip order is not same as output order
		set.add(96);
		set.add(01);
		set.add(63);			//do not allow duplicates
		set.add(50);	
		System.out.println(set);
		set.removeIf(s->s.equals(50));
		System.out.println(set);

	}
}
