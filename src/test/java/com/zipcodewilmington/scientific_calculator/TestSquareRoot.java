package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.operations.SquareRoot;
import org.junit.Assert;
import org.junit.Test;

public class TestSquareRoot {
    @Test
    public void testSquareRoot() {
        //Given: Create an instance of the SquareRoot Class
        SquareRoot squareRoot = new SquareRoot();

        //When: Perform the calculation
        double operand1 = 100;
        double result = Math.sqrt(operand1);

        //Then: Check if the result is as expected
        double expected = 10;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);
    }
}
