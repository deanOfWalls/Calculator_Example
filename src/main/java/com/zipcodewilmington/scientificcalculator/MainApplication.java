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
        operationMap.put(MathOperationType.SQUARE_ROOT, new SquareRoot());
        operationMap.put(MathOperationType.CLEAR, new ClearDisplay());
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

            if (selectedOperationType == MathOperationType.CLEAR) {
                Console.println("Display cleared.");
                continue;
            }

            int numOperands = selectedOperationType.getNumOperands();

            double[] operands = getOperandInput("Enter the operands or press 'C' to clear the display:", numOperands);
            if (operands == null) {
                continue;
            }

            MathOperation selectedOperation = operationMap.get(selectedOperationType);

            double result = selectedOperation.calculate(operands);

            Console.println("Result: %f", result);
        }
    }

    public static double[] getOperandInput(String prompt, int numOperands) {
        double[] operands = new double[numOperands];
        for (int i = 0; i < numOperands; i++) {
            String userInput = Console.getStringInput(prompt + " (Operand " + (i + 1) + "):");
            if ("C".equalsIgnoreCase(userInput)) {
                System.out.println("Cleared!");
                return null; // Return null to indicate clearing the display
            } else {
                operands[i] = Double.parseDouble(userInput);
            }
        }
        return operands;
    }

}
