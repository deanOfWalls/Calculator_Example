package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.operations.Addition;
import com.zipcodewilmington.scientificcalculator.operations.Division;
import com.zipcodewilmington.scientificcalculator.operations.Subtraction;
import org.junit.Assert;
import org.junit.Test;

public class TestDivision {
    @Test
    public void testDivision(){
        //Given: Create an instance of the Addition class
        Division division = new Division();

        //When: Perform the calculation
        double operand1 = 100;
        double operand2 = 10;
        double result = division.calculate(operand1, operand2);

        //Then: Check if the result is as expected
        double expected = 10;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);

    }
}
