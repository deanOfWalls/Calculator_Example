package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.MathOperation;

// Declare the 'ClearDisplay' class as an implementation of the 'MathOperation' interface.
public class ClearDisplay implements MathOperation {

    // Implement the 'calculate' method as required by the 'MathOperation' interface.
    @Override
    public double calculate(double... operands) {
        // Perform the clear display operation.
        // This operation is not intended to perform any mathematical calculation.
        // It's used to indicate that the display should be cleared.
        // Since it doesn't perform a calculation, we return a default value (0.0).
        return 0.0; // Return a default value (0.0) to indicate clearing the display.
    }
}
