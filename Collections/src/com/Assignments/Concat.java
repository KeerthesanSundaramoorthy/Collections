/** The Class Concat implements an application that
 * uses an iterator to print out each element and also compute the result of
 * concatenating all of this strings together. 
 * @author Keerthesan Sundaramoorthy(Expleo)
 * @since 02 Feb 2024
 */
package com.Assignments;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Concat {
	public static void main(String [] args) {
		LinkedHashSet<String> set = new LinkedHashSet();
		set.add("San");
		set.add("Logesh");			//ip order is same as output order
		set.add("Santhosh");
		set.add("Kee");
		set.add("San");	
		String S="";
		Iterator <String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
			S=S+name;
		}
		System.out.println("The Concatenated String is "+S);
	}
}

