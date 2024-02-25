/** The Class DriverClass implements an application that
 * display the names lexicographically based on firstname. 
 * @author Keerthesan Sundaramoorthy(Expleo)
 * @since 04 Feb 2024
 */
package com.Assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "\nPerson's FirstName = " + firstName + " | Person's LastName=" + lastName;
	}

	@Override
    public int compareTo(Person ob) {
        return this.firstName.compareTo(ob.getFirstName());
    }
}
public class DriverClass {
	 public static void main(String[] args) {
		 PriorityQueue<Person> queue = new PriorityQueue<>();
		 queue.add(new Person("Priscilla", "Wagner"));
		 queue.add(new Person("Tom", "Parker"));
		 queue.add(new Person("Elvis", "Presley"));
		 System.out.println("Names sorted based on first name:");
		 List<Person> personList = new ArrayList<>(queue);
		 Collections.sort(personList);
		 System.out.println(personList);
	 }
}
