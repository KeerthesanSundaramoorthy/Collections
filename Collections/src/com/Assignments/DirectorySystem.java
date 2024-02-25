/** The Class DirectorySystem implements an application 
 * designing a phone directory system that can store a list of
 * names along with their associated phone numbers.
 * @author Keerthesan Sundaramoorthy(Expleo)
 * @since 04 Feb 2024
 */
package com.Assignments;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DirectorySystem {
	public static String findNumber(String name, Map<String, String> map) {
        return map.get(name);
    }
    public static void addToSystem(String name, String phoneNumber, Map<String, String> map) {
        map.put(name, phoneNumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("Kee","7889654123");
        map.put("San","1236457890");
        map.put("Logesh","5214789630");
        map.put("Santhosh","1254789630");
        while (true) {
            System.out.println("1. Find the Number");
            System.out.println("2. Specify Phone Number");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1:
                System.out.println("Enter a name");
                String name = sc.nextLine();
                String number = findNumber(name, map);
                if (number != null) {
                    System.out.println("Phone Number: " + number);
                }
                else {
                    System.out.println("Name not found in the System.");
                }
                break;
            case 2:
                System.out.println("Enter the name:");
                String name1 = sc.nextLine();
                System.out.println("Enter the phone number:");
                String phoneNumber = sc.nextLine();
                addToSystem(name1, phoneNumber, map);
                System.out.println("Phone number added successfully.");
                break;
            case 3:
                System.out.println("Thank You!!!");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
            }
        }
    }
}

