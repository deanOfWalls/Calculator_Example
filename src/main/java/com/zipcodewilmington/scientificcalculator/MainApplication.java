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
        operationMap.put(MathOperationType.CLEAR, new ClearDisplay()); // Add ClearDisplay
    }

    public static void main(String[] args) {
        // Print a welcome message.
        Console.println("Welcome to BetterThanYour Calculator");

        while (true) {
            // Display a menu of available operations to the user.
            Console.println("Select an operation:");
            for (MathOperationType operationType : MathOperationType.values()) {
                // Print the menu options.
                Console.println(operationType.ordinal() + 1 + ". " + operationType.name());
            }

            // Get the user's choice of operation.
            int choice = Console.getIntegerInput("Enter the corresponding number:");

            // Validate the user's choice.
            if (choice < 1 || choice > MathOperationType.values().length) {
                // Print an error message for an invalid choice and exit the program.
                Console.println("Invalid choice.");
                return;
            }

            // Retrieve the selected operation type.
            MathOperationType selectedOperationType = MathOperationType.values()[choice - 1];

            // Check if the selected operation is CLEAR
            if (selectedOperationType == MathOperationType.CLEAR) {
                // Handle the clear display operation here (e.g., reset variables, clear the screen, etc.)
                // Optionally, you can also add a message to indicate that the display is cleared.
                Console.println("Display cleared.");
                continue; // Continue to the next iteration of the loop.
            }

            // Get the first operand from the user or handle the clear display operation.
            Double operand1 = getOperandInput("Enter the first operand or press 'C' to clear the display:");
            if (operand1 == null) {
                continue; // Skip the rest of the loop iteration if 'C' was entered
            }

            // Get the second operand from the user or handle the clear display operation.
            Double operand2 = getOperandInput("Enter the second operand or press 'C' to clear the display:");
            if (operand2 == null) {
                continue; // Skip the rest of the loop iteration if 'C' was entered
            }

            // Retrieve the selected MathOperation based on the selected operation type.
            MathOperation selectedOperation = operationMap.get(selectedOperationType);

            // Perform the calculation using the selected operation and operands.
            double result = selectedOperation.calculate(operand1, operand2);

            // Print the result of the calculation.
            Console.println("Result: %f", result);
        }
    }

    // Define the modified getOperandInput method.
    public static Double getOperandInput(String prompt) {
        // Get a Double input from the user using the Console class.
        Double result = Console.getDoubleInput(prompt);
        // Check if the result is null (indicating a clear display operation).
        if (result == null) {
            // Print a message to indicate that the display is cleared.
            Console.println("Display cleared.");
        }
        // Return the result (null or a valid Double value).
        return result;
    }
}
