package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.operations.Exponentiation;
import org.junit.Assert;
import org.junit.Test;

public class TestExponentation {
    @Test
    public void testExponentiation() {
        //Given: Create an instance of the Exponentiation Class
        Exponentiation exponentiation = new Exponentiation();

        //When: Perform the calculation
        double operand1 = 9;
        double operand2 = 2;
        double result = exponentiation.calculate(operand1, operand2);

        //Then: Check if the result is as expected
        double expected = 81;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);
    }
}

