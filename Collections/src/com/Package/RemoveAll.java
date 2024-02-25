package com.Package;

import java.util.ArrayList;

public class RemoveAll {
	 public static void main(String[] args) {
	    	ArrayList <String> arr = new ArrayList<>();
	    	arr.add("2");
	    	arr.add("4");
	    	arr.add("7");
	    	arr.add("1");
	    	arr.add("0");
	    	arr.add("6");
	    	System.out.println(arr);
	    	ArrayList <String> arr1 = new ArrayList<>();
	    	arr1.add("9");
	    	arr1.add("6");
	    	arr1.add("4");
	    	arr1.add("0");
	    	arr1.add(2,"66");
	    	System.out.println(arr1);
	    	arr.removeAll(arr1);
	    	System.out.println(arr);

	    }
}
