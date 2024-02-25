package com.LinkedList;

import java.util.LinkedList;

public class Element {
	public static void main(String [] args) {
		LinkedList <Integer> list = new LinkedList<>();
		list.offer(3333);
		list.add(3);
		list.add(2);
		list.add(16);
		list.add(0);
		list.add(402);
//		System.out.println(list.element());	//element method gives the first element of the list
//		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
//		System.out.println(list.peekFirst()); //gives the first element of the list
//		System.out.println(list);
//		System.out.println(list.peekLast());	//gives the last element of the list
//		System.out.println(list);
//		System.out.println(list.poll());	//remove and print 1st element in list
//		System.out.println(list);		
//		System.out.println(list.pollLast());	//remove and print last element in list
//		System.out.println(list);	
		list.push(4);
		System.out.println(list);		
		list.addFirst(3);
		System.out.println(list);		
		list.remove(2);
		System.out.println(list);		
	}
}
