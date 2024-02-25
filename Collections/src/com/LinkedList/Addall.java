package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Addall {
	public static void main(String [] args) {
		LinkedList <Integer> list = new LinkedList<>();
		list.offer(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		LinkedList <Integer> list1 = new LinkedList<>();
		list1.offer(100);
		list1.add(101);
		list1.add(102);
		list1.addAll(list);
		Iterator<Integer> iter = list1.iterator();
		System.out.println("The new Linked list is");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		list1.remove(2);
		list1.add(3,500);
		list1.addFirst(1000);
		System.out.println(list1);
	}
}
