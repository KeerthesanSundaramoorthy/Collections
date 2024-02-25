/** The Class HashKey implements an application that
 * Push the keys (name of the student) of the hash map into a stack, where
 * the corresponding value(marks) is greater than 75 and 
 * Pop and display the content of the stack.
 * @author Keerthesan Sundaramoorthy(Expleo)
 * @since 03 Feb 2024
 */
package com.Assignments;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class HashKey {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<>();
		System.out.println("Enter the Total Students");
		int count = sc.nextInt();
		sc.nextLine();
		for (int i=1;i<=count;i++) {
			System.out.println("Enter the Students "+i+" Name:");
			String str = sc.nextLine();
			System.out.println("Enter the Students "+i+" Marks:");
			int marks = sc.nextInt();
			sc.nextLine();
			map.put(str,marks);
		}
		displayStack(map);
		
	}
	public static void displayStack(HashMap<String,Integer> map) {
		Stack<String> names=new Stack<>();
		for(String name:map.keySet()) {
			int marks = map.get(name);
			if(marks>75) {
				names.push(name);
			}
		}
		System.out.println("Student Names whose Marks more than 75");
		System.out.println(names);
		popDisplay(names);
	}
	public static void popDisplay(Stack<String> names) {
		System.out.println("Elements in Pop");
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}
	}
}
