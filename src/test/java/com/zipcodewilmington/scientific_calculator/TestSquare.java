package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.operations.Square;
import org.junit.Assert;
import org.junit.Test;

public class TestSquare {
    @Test
    public void testSquare() {
        //Given: Create an instance of the Square Class
        Square square = new Square();

        //When: Perform the calculation
        double operand1 = 10;
        double result = operand1 * operand1;

        //Then: Check if the result is as expected
        double expected = 100;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);
    }
}

