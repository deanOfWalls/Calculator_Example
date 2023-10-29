package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.operations.Division;
import com.zipcodewilmington.scientificcalculator.operations.Exponentiation;
import org.junit.Assert;
import org.junit.Test;

public class TestExponentiation {
    @Test
    public void testExponentation() {
        //Given: Create an instance of the Exponentiation Class
        Exponentiation exponentiation = new Exponentiation();

        //When: Perform the calculation
        double operand1 = 9;
        double operand2 = 2;
        double result = Math.pow(operand1, operand2);

        //Then: Check if the result is as expected
        double expected = 81;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);
    }
}
