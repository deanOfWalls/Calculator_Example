package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.operations.Addition;
import com.zipcodewilmington.scientificcalculator.operations.Subtraction;
import org.junit.Assert;
import org.junit.Test;

public class TestSubtraction {
    @Test
    public void TestSubtraction(){
        //Given: Create an instance of the Addition class
        Subtraction subtraction = new Subtraction();

        //When: Perform the calculation
        double operand1 = 10;
        double operand2 = 9;
        double result = subtraction.calculate(operand1, operand2);

        //Then: Check if the result is as expected
        double expected = 1;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);

    }
}
