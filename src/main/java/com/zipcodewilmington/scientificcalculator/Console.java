package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String input = scanner.nextLine();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            println("Invalid input. Please enter an integer.");
            return getIntegerInput(prompt);
        }
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String input = scanner.nextLine();

        if ("C".equalsIgnoreCase(input)) {
            return null; // Return null to indicate clearing the display
        }

        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            println("Invalid input. Please enter a double.");
            return getDoubleInput(prompt);
        }
    }

}
