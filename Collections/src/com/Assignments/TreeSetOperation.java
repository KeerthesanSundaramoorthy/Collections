/** The Class TreeSetOperation implements an application that
 * Display All Words,Display with Capitalized Plurals,
 *  Display in Reverse Order,Display with Plural Words Removed.
 * @author Keerthesan Sundaramoorthy(Expleo)
 * @since 03 Feb 2024
 */
package com.Assignments;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetOperation {
	private static void displayAllWords(TreeSet<String> set) {
        if (set.isEmpty()) {
            System.out.println("The set is empty.");
        } 
        else {
            System.out.println("All Words: " + set);
        }
    }

    private static void displayCapitalizedPlurals(TreeSet<String> set) {
        String result = set.stream()
                .map(word -> word.endsWith("s") || word.endsWith("S") ?
                        word.substring(0, word.length() - 1).toUpperCase() : word)
                .collect(Collectors.joining(" "));

        if (result.isEmpty()) {
            System.out.println("No words exists in capitalized plurals.");
        } else {
            System.out.println("Words with Capitalized Plurals: " + result);
        }
    }

    private static void displayInReverseOrder(TreeSet<String> set) {
        String result = set.descendingSet().stream()
                .collect(Collectors.joining(" "));

        if (result.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println("Words in Reverse Order: " + result);
        }
    }

    private static void displayWithoutPlurals(TreeSet<String> set) {
        String result = set.stream()
                .filter(word -> !(word.endsWith("s") || word.endsWith("S")))
                .collect(Collectors.joining(" "));

        if (result.isEmpty()) {
            System.out.println("No words without plurals.");
        } else {
            System.out.println("Words without Plurals: " + result);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> stringSet = new TreeSet<>();
        while (true) {
        	 System.out.println("1. Add a new word");
             System.out.println("2. Display All Words");
             System.out.println("3. Display with Capitalized Plurals");
             System.out.println("4. Display in Reverse Order");
             System.out.println("5. Remove Plural Words");
             System.out.println("6. Exit");
             System.out.print("Enter your choice: ");
             int choice;
             try {
                 choice = Integer.parseInt(scanner.nextLine());
             } 
             catch (NumberFormatException e) {
                 System.out.println("Invalid input. Please enter a number.");
                 continue;
             }

            switch (choice) {
                case 1:
                	  System.out.print("Enter a sentence");
                      String wordsInput = scanner.nextLine();
                      String[] words = wordsInput.split(" ");
                      stringSet.addAll(Arrays.asList(words));
                      System.out.println("Words updated successfully!");
                      break;
                case 2:
                    displayAllWords(stringSet);
                    break;
                case 3:
                    displayCapitalizedPlurals(stringSet);
                    break;
                case 4:
                    displayInReverseOrder(stringSet);
                    break;
                case 5:
                    displayWithoutPlurals(stringSet);
                    break;
                case 6:
                    System.out.println("Exit The Application");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
