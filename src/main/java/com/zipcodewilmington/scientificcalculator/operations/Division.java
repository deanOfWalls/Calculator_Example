package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.MathOperation;

// Declare the 'Division' class as an implementation of the 'MathOperation' interface.
public class Division implements MathOperation {

    // Implement the 'calculate' method as required by the 'MathOperation' interface.
    @Override
    public double calculate(double operand1, double operand2) {
        // Calculate the result of dividing 'operand1' by 'operand2' and store it in the 'answer' variable.
        double answer = operand1 / operand2;
        // Return the calculated result, which represents the result of the division operation.
        return answer;
    }
}
