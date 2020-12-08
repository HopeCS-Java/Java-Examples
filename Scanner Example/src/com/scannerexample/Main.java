/*
 * Basic example of using scanner to get an input from a user.
 */
package com.scannerexample;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates a new scanner object which we can use to get an input from the user
        System.out.println("Enter some text: "); // Prompt user for text
        String str = input.nextLine(); // Get the inputted text
        System.out.println("You Entered: " + str); // Output the text
    }
}
