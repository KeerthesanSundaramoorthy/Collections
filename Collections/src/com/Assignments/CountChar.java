/** The Class CountChar implements an application that
 *  print count (number of occurrences) of characters a,c,o and s in the string
 * @author Keerthesan Sundaramoorthy(Expleo)
 * @since 02 Feb 2024package com.Assignments;
*/
package com.Assignments;
import java.util.HashMap;
import java.util.Scanner;

public class CountChar {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> map = new HashMap<>();
		System.out.println("Enter a String");
		String str = sc.nextLine();
		for(char a:str.toCharArray()) {
			if(a == 'a' || a == 'c' || a == 'o' || a == 's') {
				map.put(a,map.getOrDefault(a,0)+1);
			}
		}
			System.out.println("A occured "+map.getOrDefault('a',0)+" times");
			System.out.println("C occured "+map.getOrDefault('c',0)+" times");
			System.out.println("O occured "+map.getOrDefault('o',0)+" times");
			System.out.println("S occured "+map.getOrDefault('s',0)+" times");
	}
}
