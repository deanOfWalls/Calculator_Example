package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.MathOperation;

// Declare the 'Subtraction' class as an implementation of the 'MathOperation' interface.
public class Subtraction implements MathOperation {

    // Implement the 'calculate' method as required by the 'MathOperation' interface.
    @Override
    public double calculate(double operand1, double operand2) {
        // Calculate the result of subtracting 'operand2' from 'operand1' and store it in the 'answer' variable.
        double answer = operand1 - operand2;
        // Return the calculated result, which represents the result of the subtraction operation.
        return answer;
    }
}
