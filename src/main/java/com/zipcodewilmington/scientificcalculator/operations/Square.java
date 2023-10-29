package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.MathOperation;

public class Square implements MathOperation {
    // Implement the 'calculate' method as required by the 'MathOperation' interface.
    @Override
    public double calculate(double... operands) {
        // Calculate the square of an operand
        double operand1 = operands[0];
        double answer = operand1 * operand1;
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }
}

