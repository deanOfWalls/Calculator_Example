package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.MathOperation;

public class Division implements MathOperation {
    @Override
    public double calculate(double operand1, double operand2){
        double answer = operand1 / operand2;
        return answer;
    }
}
