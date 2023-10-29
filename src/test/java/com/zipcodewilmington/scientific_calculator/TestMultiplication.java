package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.operations.Addition;
import com.zipcodewilmington.scientificcalculator.operations.Multiplication;
import com.zipcodewilmington.scientificcalculator.operations.Subtraction;
import org.junit.Assert;
import org.junit.Test;

public class TestMultiplication {
    @Test
    public void testMultiplication(){
        //Given: Create an instance of the Addition class
        Multiplication multiplication = new Multiplication();

        //When: Perform the calculation
        double operand1 = 9;
        double operand2 = 9;
        double result = multiplication.calculate(operand1, operand2);

        //Then: Check if the result is as expected
        double expected = 81;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);

    }
}
