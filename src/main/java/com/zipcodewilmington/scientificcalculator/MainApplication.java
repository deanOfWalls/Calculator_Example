package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class MainApplication {
    private static final Map<MathOperationType, MathOperation> operationMap = new HashMap<>();

    static {
        operationMap.put(MathOperationType.ADDITION, new Addition());
        operationMap.put(MathOperationType.SUBTRACTION, new Subtraction());
        operationMap.put(MathOperationType.MULTIPLICATION, new Multiplication());
        operationMap.put(MathOperationType.DIVISION, new Division());
        operationMap.put(MathOperationType.CLEAR, new ClearDisplay()); // Add ClearDisplay
    }

    public static void main(String[] args) {
        Console.println("Welcome to BetterThanYour Calculator");

        while (true) {
            Console.println("Select an operation:");
            for (MathOperationType operationType : MathOperationType.values()) {
                Console.println(operationType.ordinal() + 1 + ". " + operationType.name());
            }

            int choice = Console.getIntegerInput("Enter the corresponding number:");

            if (choice < 1 || choice > MathOperationType.values().length) {
                Console.println("Invalid choice.");
                return;
            }

            MathOperationType selectedOperationType = MathOperationType.values()[choice - 1];

            // Check if the selected operation is CLEAR
            if (selectedOperationType == MathOperationType.CLEAR) {
                // Handle the clear display operation here (e.g., reset variables, clear the screen, etc.)
                // Optionally, you can also add a message to indicate that the display is cleared.
                Console.println("Display cleared.");
                continue;
            }

            Double operand1 = getOperandInput("Enter the first operand or press 'C' to clear the display:");
            if (operand1 == null) {
                continue; // Skip the rest of the loop iteration if 'C' was entered
            }

            Double operand2 = getOperandInput("Enter the second operand or press 'C' to clear the display:");
            if (operand2 == null) {
                continue; // Skip the rest of the loop iteration if 'C' was entered
            }

            MathOperation selectedOperation = operationMap.get(selectedOperationType);

            double result = selectedOperation.calculate(operand1, operand2);

            Console.println("Result: %f", result);
        }
    }

    // Define the modified getOperandInput method
    public static Double getOperandInput(String prompt) {
        Double result = Console.getDoubleInput(prompt);
        if (result == null) {
            Console.println("Display cleared.");
        }
        return result;
    }
}
