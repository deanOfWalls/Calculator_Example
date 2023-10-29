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
    }

    public static void main(String[] args) {
        Console.println("Welcome to BetterThanYour Calculator");

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
        MathOperation selectedOperation = operationMap.get(selectedOperationType);

        double operand1 = Console.getDoubleInput("Enter the first operand:");
        double operand2 = Console.getDoubleInput("Enter the second operand:");

        double result = selectedOperation.calculate(operand1, operand2);

        Console.println("Result: %f", result);
    }
}
