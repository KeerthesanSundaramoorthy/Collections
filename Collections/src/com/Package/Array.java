package com.Package;
import java.util.ArrayList;
import java.util.*;

public class Array {
	 public static void main(String[] args) {
	    	ArrayList <String> arr = new ArrayList<>();
	    	arr.add("2");
	    	arr.add("4");
	    	arr.add("7");
	    	arr.add("1");
	    	arr.add("55");
	    	arr.add("6");
	    	System.out.println(arr);
	    	System.out.println(Collections.min(arr));
	    	ArrayList <String> arr1 = new ArrayList<>();
	    	arr1.add("9");
	    	arr1.add("6");
	    	arr1.add("4");
	    	arr1.add("0");
	    	arr1.add(2,"66");
	    	arr1.remove(1);
	    	arr1.addAll(arr);
	    	System.out.println(arr1);
	    	arr1.clear();
	    	System.out.println(arr1);

	    }

}
