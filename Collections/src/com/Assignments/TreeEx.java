
/** The Class TreeEx implements an application that
 *  Prints the average of the numbers.
 *  Prints the highest and lowest number.
 *  Filters out all of the even numbers (ones divisible by 2). 
 * @author Keerthesan Sundaramoorthy(Expleo)
 * @since 03 Feb 2024
 */
package com.Assignments;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeEx {
	public static void main(String [] args) {
		TreeSet<Integer> set = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Numbers");
		int count = sc.nextInt();
		for (int i=1;i<=count;i++) {
			System.out.println("Enter the Number "+i);
			int num = sc.nextInt();
			set.add(num);
		}
		averagenumber(set);
		HighestAndLowestNumber(set);
		evenNumbers(set);
	}
	public static void averagenumber(TreeSet<Integer> set)  {
		System.out.println("The Average Of Numbers ");
		double num = set.stream()
						.mapToDouble(Integer::intValue)
						.average()
						.orElse(0.0);
		System.out.println(num);
	}
	public static void HighestAndLowestNumber(TreeSet<Integer> set) {
		int high = set.stream().max(Integer::compareTo).orElse(0);
		System.out.println("The Maximum Value in Numbers is "+high);
		int low = set.stream().min(Integer::compareTo).orElse(0);
		System.out.println("The Minimum Value in Numbers is "+low);
	}
	public static void evenNumbers(TreeSet<Integer> set) {
		System.out.println("The Even Numbers are");
		set.stream().filter(n->n%2==0).forEach(System.out::println);
	}
}