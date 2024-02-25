/** The Class Operations implements an application that
 * removes the names whose length is less than or equal to 5 characters.
 * @author Keerthesan Sundaramoorthy(Expleo)
 * @since 02 Feb 2024
 */
package com.Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Operations {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Names");
		int count = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<count;i++) {
			System.out.println("Enter the Name "+(i+1));
			String str = sc.nextLine();
			list.add(str);
		}
		System.out.println("The Output Names");
		Iterator <String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(name.length()<=5) {
				it.remove();
			}
			else {
				System.out.println(name);
			}
		}
	}
}
