package com.Package;

import java.util.*;
public class SetGet {
	 public static void main(String[] args) {
	    	ArrayList <Integer> arr = new ArrayList<>();
	    	arr.add(2);
	    	arr.add(4);
	    	arr.add(7);
	    	arr.add(1);
	    	arr.add(0);
	    	arr.add(6);
	    	System.out.println(arr);
	    	if(arr.contains(111)) {
		    	System.out.println("111 is present");
	    	}
	    	else {
		    	System.out.println("5 is not present");
	    	}
	    	arr.set(3, 111);
	    	System.out.println(arr.get(3));
	    	System.out.println(arr);
	    	if(arr.contains(111)) {
		    	System.out.println("111 is present");
	    	}
	    	else {
		    	System.out.println("111 is not present");
	    	}
	    	Collections.sort(arr);
	    	System.out.println(arr);
	    	arr.remove(5);
	    	System.out.println(arr);

	 }

}
