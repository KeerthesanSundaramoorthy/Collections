///** The Class UserValidate implements an application that
// * implement an application that would validate a member’s login.
// * @author Keerthesan Sundaramoorthy(Expleo)
// * @since 04 Feb 2024
// */
//package com.Assignments;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class UserValidate {
//	// static int count = 1;
//	 public static HashMap<String,String> createAHashMap() {
//		 HashMap<String,String> temp = new HashMap<>();
//		 try {
//			 BufferedReader read = new BufferedReader(new FileReader("D:\\UserCredentials.txt"));
//			 String line;
//			 while((line=read.readLine())!=null) {
//				 String[]words = line.split(" ");
//				 String userName = words[2];
//				 String password = words[3];
//				 temp.put(userName,password);
//			 }
//			 read.close();
//		 }
//		 catch(Exception e) {
//			 System.out.println(e.getMessage());
//		 }
//		return temp;
//	 }
//	 public static void getFullName(String userName,String password) {
//		 try {
//		 	 BufferedReader read = new BufferedReader(new FileReader("D:\\UserCredentials.txt"));
//			 String line;
//			 String firstName="";
//			 String lastName="";
//			 while((line=read.readLine())!=null) {
//				 String[]words = line.split(" ");
//				 String tempUserName = words[2];
//				 String tempPassword = words[3];
//				 if(userName.equals(tempUserName) && password.equals(tempPassword)) {
//					 firstName = words[0];
//					 lastName = words[1];
//				 }
//			 }
//			 read.close();
//			 System.out.println("Welcome "+firstName+" "+lastName+"!!");
//		 }
//		 catch(Exception e) {
//			 System.out.println(e.getMessage());
//		 }
//	 }
//	 public static void validate(HashMap<String,String> map,String userName,String password) {
//		 if (map.containsKey(userName) && map.get(userName).equalsIgnoreCase(password)) {
//			 System.out.println("Login Successful!! ");
//			 getFullName(userName,password);
//		 }
//		 else {
//			 System.out.println("Invalid User Name and Password");
//		 }
//	 }
//	 public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        HashMap<String,String> map =createAHashMap();
//	        int count=1;
//	        while(count<=3) {
//		        System.out.println("Enter the Login: ");
//		        String userName = sc.nextLine();
//		        System.out.println("Enter the Password: ");
//		        String password = sc.nextLine();
//		        validate(map,userName,password);
//		        count++;
//	        }
//	        if(count>3) {
//	        	System.out.println("You have Entered Invalid Credentails and exceeded Daily Limit");
//	        }
//	 }                  
//}


// with the use of stream api
package com.Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserValidate {

    public static Map<String, String> createAHashMap() {
        Map<String, String> temp = new HashMap<>();
        try (BufferedReader read = new BufferedReader(new FileReader("D:\\UserCredentials.txt"))) {
            read.lines()
                .map(line -> line.split(" "))
                .forEach(words -> temp.put(words[2], words[3]));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return temp;
    }

    public static void getFullName(String userName, String password) {
        try (BufferedReader read = new BufferedReader(new FileReader("D:\\UserCredentials.txt"))) {
            read.lines()
                .map(line -> line.split(" "))
                .filter(words -> userName.equals(words[2]) && password.equals(words[3]))
                .findFirst()
                .ifPresent(words -> System.out.println("Welcome " + words[0] + " " + words[1] + "!!"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validate(Map<String, String> map, String userName, String password) {
        if (map.containsKey(userName) && map.get(userName).equalsIgnoreCase(password)) {
            System.out.println("Login Successful!! ");
            getFullName(userName, password);
        } else {
            System.out.println("Invalid User Name and Password");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = createAHashMap();
        int count = 1;
        while (count <= 3) {
            System.out.println("Enter the Login: ");
            String userName = sc.nextLine();
            System.out.println("Enter the Password: ");
            String password = sc.nextLine();
            validate(map, userName, password);
            count++;
        }
        if (count > 3) {
            System.out.println("You have Entered Invalid Credentials and exceeded Daily Limit");
        }
    }
}
