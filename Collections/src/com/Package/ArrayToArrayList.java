package com.Package;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayToArrayList {
	public static void main(String[] args) {
//		int []arr=new int[] {1,9,3,4,5};
//		Integer[] newArr=new Integer[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			newArr[i]=Integer.valueOf(arr[i]);
//		}
//		ArrayList <Integer> al = new ArrayList<>(Arrays.asList(newArr));
//		System.out.println(al);
		
		Integer[] arr=new Integer[] {1,2,3,45};
		ArrayList<Integer> newarr=new ArrayList<>(Arrays.asList(arr));
		Iterator<Integer> it = newarr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
