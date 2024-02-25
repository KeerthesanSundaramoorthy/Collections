package com.Package;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorEx {
	public static void main(String[] args) {
    	ArrayList <String> arr = new ArrayList<>();
    	arr.add("2");
    	arr.add("4");
    	arr.add("7");
    	arr.add("1");
    	arr.add("2");
    	arr.add("6");
    	Iterator <String> it =arr.iterator(); 
    	while(it.hasNext()) {	//has next returns boolean 
    		System.out.println(it.next());
    	}
	}
}
