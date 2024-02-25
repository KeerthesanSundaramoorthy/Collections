package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment {
	public static void main(String [] args) {
		LinkedList <String> list = new LinkedList<>();
		list.add("San");
		list.add("Anadh");
		list.add("Lokie");
		list.add("Vijay");
		list.add("Santhosh");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name=it.next();
			if(name.length()!=5) {
				it.remove();
			}
		}
		
		System.out.println(list);
	}
}
