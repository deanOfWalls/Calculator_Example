package com.zipcodewilmington.scientificcalculator;

public enum MathOperationType {
    ADDITION(2),
    SUBTRACTION(2),
    MULTIPLICATION(2),
    DIVISION(2),
    SQUARE_ROOT(1),
    CLEAR(0);

    private final int numOperands;

    MathOperationType(int numOperands) {
        this.numOperands = numOperands;
    }

    public int getNumOperands() {
        return numOperands;
    }
}
