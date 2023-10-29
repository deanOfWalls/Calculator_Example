package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class MainApplication {
    // Create a map to associate each MathOperationType with its corresponding MathOperation implementation.
    private static final Map<MathOperationType, MathOperation> operationMap = new HashMap<>();

    // Initialize the map with instances of MathOperation implementations for each type.
    static {
        operationMap.put(MathOperationType.ADDITION, new Addition());
        operationMap.put(MathOperationType.SUBTRACTION, new Subtraction());
        operationMap.put(MathOperationType.MULTIPLICATION, new Multiplication());
        operationMap.put(MathOperationType.DIVISION, new Division());
        operationMap.put(MathOperationType.SQUARE_ROOT, new SquareRoot());
        operationMap.put(MathOperationType.SQUARE, new Square());
        operationMap.put(MathOperationType.EXPONENTIATION,new Exponentiation());
        operationMap.put(MathOperationType.CLEAR, new ClearDisplay());
    }

    public static void main(String[] args) {
        // Print a welcome message to the console.
        Console.println("Welcome to BetterThanYour Calculator");

        while (true) {
            // Display a menu of available operations to the user.
            Console.println("Select an operation:");
            for (MathOperationType operationType : MathOperationType.values()) {
                // Print the menu options with corresponding numbers.
                Console.println(operationType.ordinal() + 1 + ". " + operationType.name());
            }

            // Get the user's choice of operation as an integer.
            int choice = Console.getIntegerInput("Enter the corresponding number:");

            // Validate the user's choice.
            if (choice < 1 || choice > MathOperationType.values().length) {
                // Print an error message for an invalid choice and exit the program.
                Console.println("Invalid choice.");
                return;
            }

            // Retrieve the selected operation type based on the user's choice.
            MathOperationType selectedOperationType = MathOperationType.values()[choice - 1];

            // Check if the selected operation is CLEAR
            if (selectedOperationType == MathOperationType.CLEAR) {
                // Print a message to indicate that the display is cleared.
                Console.println("Display cleared.");
                continue; // Continue to the next iteration of the loop.
            }

            // Determine the number of operands required for the selected operation.
            int numOperands = selectedOperationType.getNumOperands();

            // Get the operands from the user or handle the clear display operation.
            double[] operands = getOperandInput("Enter the operands or press 'C' to clear the display:", numOperands);
            if (operands == null) {
                continue; // Skip the rest of the loop iteration if 'C' was entered
            }

            // Retrieve the selected MathOperation based on the selected operation type.
            MathOperation selectedOperation = operationMap.get(selectedOperationType);

            // Perform the calculation using the selected operation and operands.
            double result = selectedOperation.calculate(operands);

            // Print the result of the calculation.
            Console.println("Result: %f", result);
        }
    }

    // Define the modified getOperandInput method to handle multiple operands.
    public static double[] getOperandInput(String prompt, int numOperands) {
        double[] operands = new double[numOperands];
        for (int i = 0; i < numOperands; i++) {
            // Get user input for each operand or handle the clear display operation.
            String userInput = Console.getStringInput(prompt + " (Operand " + (i + 1) + "):");
            if ("C".equalsIgnoreCase(userInput)) {
                // Print a message to indicate that the display is cleared.
                System.out.println("Cleared!");
                return null; // Return null to indicate clearing the display
            } else {
                // Parse the user input as a double and store it in the operands array.
                operands[i] = Double.parseDouble(userInput);
            }
        }
        return operands;
    }
}
