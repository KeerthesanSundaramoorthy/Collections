package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Example {
	public static void main(String [] args) {
		LinkedList <Integer> list = new LinkedList<>();
		list.offer(3333);
		list.add(3);
		list.add(2);
		list.add(16);
		list.add(0);
		list.add(402);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("the element at 5th index is");
		System.out.println(list.get(5));

	}
}
