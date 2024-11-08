package com.maveric.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorUnitTests {

    Calculator calculator;

    @BeforeEach
    void setup() {
        Adder adder = new Adder();
        calculator = new Calculator(adder);
    }

    @AfterEach
    void teardown(){
        calculator=null;
    }

    /**
     * Given : two numbers (3,6)
     * When: sum of Calculator called
     * Then: it should return 9
     */
    @Test
    void sum_1() {
        final int expectation = 9;
        final int result = calculator.sum(3, 6);
        assertEquals(expectation, result);
    }

    /**
     * Given : two negative numbers (-3,-9)
     * When: sum of Calculator called
     * Then: it should return -12
     */
    @Test
    void sum_2() {
        final int expectation = -12;
        final int result = calculator.sum(-3, -9);
        assertEquals(expectation, result);
    }
}


