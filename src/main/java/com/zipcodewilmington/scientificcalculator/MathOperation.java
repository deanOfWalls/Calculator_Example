package com.zipcodewilmington.scientificcalculator;

// Define a Java interface named MathOperation.
public interface MathOperation {
    // Declare an abstract method named 'calculate' that takes two double parameters: 'operand1' and 'operand2'.
    // This method will be implemented by concrete classes to perform specific mathematical operations.
    double calculate(double operand1, double operand2);
}
