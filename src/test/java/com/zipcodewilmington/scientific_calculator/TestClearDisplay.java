package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.operations.ClearDisplay;
import org.junit.Assert;
import org.junit.Test;

public class TestClearDisplay {
    @Test
    public void testClearDisplay(){
        //Given: Create an instance of the ClearDisplay class'
        ClearDisplay clearDisplay = new ClearDisplay();

        //When: Perform the calculation (clear display)
        double operand1 = 5.0;
        double operand2 = 10.0;
        double result = clearDisplay.calculate(operand1, operand2);

        //Then: Check if the result is 0.0 (indicating display was cleared)
        double expected = 0.0;
        double delta = 0.001;
        Assert.assertEquals(expected, result, delta);
    }
}
