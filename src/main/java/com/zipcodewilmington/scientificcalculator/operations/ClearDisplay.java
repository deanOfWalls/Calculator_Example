package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.MathOperation;

public class ClearDisplay implements MathOperation {
    @Override
    public double calculate(double operand1, double operand2){
        //Perform the clear display operation
        return 0.0; //Return a default value
    }
}
