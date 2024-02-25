package com.Package;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList <String> arr= new ArrayList<>();
		arr.add("San");
		arr.add("Khan");
		arr.add("Logesh");
		arr.add("Santhosh");
		System.out.println("The array output is");
		String []newarr=arr.toArray(new String[0]);
		for(String i:newarr) {
			System.out.println(i);
		}
		Iterator <String> it=arr.iterator();
		System.out.println("The Iterator output is");
		while(it.hasNext()) {
			System.out.println(it.next());
			if(it.next().startsWith("S")) {
				it.remove();
			}
		}
		System.out.println("The New Array list is");
		System.out.println(arr);
	}
}
