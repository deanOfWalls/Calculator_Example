package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.operations.Addition;
import org.junit.Assert;
import org.junit.Test;

public class TestAddition {
    @Test
    public void TestAddition(){
        //Given: Create an instance of the Addition class
        Addition addition = new Addition();

        //When: Perform the calculation
        double operand1 = 6;
        double operand2 = 4;
        double result = addition.calculate(operand1, operand2);

        //Then: Check if the result is as expected
        double expected = 10;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);

    }
}
