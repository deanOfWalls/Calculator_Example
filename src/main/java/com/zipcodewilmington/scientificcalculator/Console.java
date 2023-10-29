package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18. (sounds like a claim)
 */
public class Console {

    // Define a method 'print' that takes a format string and an array of objects as arguments.
    public static void print(String output, Object... args) {
        // Use the 'printf' method to print a formatted string to the console.
        System.out.printf(output, args);
    }

    // Define a method 'println' that takes a format string and an array of objects as arguments.
    public static void println(String output, Object... args) {
        // Call the 'print' method to print the formatted string followed by a newline character.
        print(output + "\n", args);
    }

    // Define a method 'getStringInput' that takes a prompt as an argument and returns a user-entered string.
    public static String getStringInput(String prompt) {
        // Create a new Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        // Print the provided prompt to the console.
        println(prompt);
        // Read a line of text entered by the user and store it in the 'userInput' variable.
        String userInput = scanner.nextLine();
        // Return the user-entered string.
        return userInput;
    }

    // Define a method 'getIntegerInput' that takes a prompt as an argument and returns a user-entered integer.
    public static Integer getIntegerInput(String prompt) {
        // Create a new Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        // Print the provided prompt to the console.
        println(prompt);
        // Read a line of text entered by the user and store it in the 'input' variable.
        String input = scanner.nextLine();

        try {
            // Attempt to parse the input string as an integer and return the result.
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // If a NumberFormatException occurs (invalid input), print an error message and recursively call 'getIntegerInput' to retry.
            println("Invalid input. Please enter an integer.");
            return getIntegerInput(prompt);
        }
    }

    // Define a method 'getDoubleInput' that takes a prompt as an argument and returns a user-entered double.
    public static Double getDoubleInput(String prompt) {
        // Create a new Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        // Print the provided prompt to the console.
        println(prompt);
        // Read a line of text entered by the user and store it in the 'input' variable.
        String input = scanner.nextLine();

        // Check if the input is equal to 'C' (case-insensitive) to handle clearing the display.
        if ("C".equalsIgnoreCase(input)) {
            // Return null to indicate clearing the display.
            return null;
        }

        try {
            // Attempt to parse the input string as a double and return the result.
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            // If a NumberFormatException occurs (invalid input), print an error message and recursively call 'getDoubleInput' to retry.
            println("Invalid input. Please enter a double.");
            return getDoubleInput(prompt);
        }
    }

}
