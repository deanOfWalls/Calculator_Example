package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.MathOperation;

public class SquareRoot implements MathOperation {

    // Implement the 'calculate' method as required by the 'MathOperation' interface.
    @Override
    public double calculate(double... operands) {
        // Calculate the product of 'operand1' and 'operand2' and store it in the 'answer' variable.
        double operand1 = operands[0];
        double answer = Math.sqrt(operand1);
        // Return the calculated result, which represents the result of the multiplication operation.
        return answer;
    }
}

