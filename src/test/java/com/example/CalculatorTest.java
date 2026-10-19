package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void addsNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.add(2, -3));
    }
}
