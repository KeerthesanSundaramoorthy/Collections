package com.Package;

import java.util.ArrayList;

public class LastIndex {
	public static void main(String[] args) {
    	ArrayList <String> arr = new ArrayList<>();
    	arr.add("2");
    	arr.add("4");
    	arr.add("7");
    	arr.add("1");
    	arr.add("2");
    	arr.add("6");
    	System.out.println("The list is "+arr);
    	
    	System.out.println(arr.lastIndexOf("2")); // 2 is present in the list so it returns its position which is lastly occuered
    	System.out.println(arr.lastIndexOf("0")); // 0 is not present in the list so it returns -1
    	

    }
}
