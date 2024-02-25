package com.Hash;
import java.util.*;
public class ProiorityQueue {
	public static void main(String args[]){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(6);
		pq.add(5);
		pq.add(8);
		pq.add(0);
		pq.add(9);
		pq.add(1);
		System.out.println("Elements in the PriorityQueue "+pq);
		pq.remove(9);
		System.out.println("Elements in the PriorityQueue after remove "+pq);
		System.out.println(pq.peek());
		System.out.println("Elements in the PriorityQueue after Peek Operation "+pq);
		System.out.println(pq.poll());
		System.out.println("Elements in the PriorityQueue after Poll Operation "+pq);
		
	}
}
