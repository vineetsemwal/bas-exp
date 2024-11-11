package com.maveric.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorUnitTests {


    @Mock
    Adder adder;

    @InjectMocks
    @Spy
    Calculator calculator;

    /*
    @BeforeEach
    void setup() {
        adder = mock(Adder.class);
        calculator = new Calculator(adder);
        Calculator spy=spy(calculator);
    }*/

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
        when(adder.add(3, 6)).thenReturn(9);
        final int result = calculator.sum(3, 6);
        assertEquals(expectation, result);
        verify(adder).add(3,6);
    }

    /**
     * Given : two negative numbers (-3,-9)
     * When: sum of Calculator called
     * Then: it should return -12
     */
    @Test
    void sum_2() {
        final int expectation = -12;
        when(adder.add(-3, -9)).thenReturn(-12);
        final int result = calculator.sum(-3, -9);
        assertEquals(expectation, result);
        verify(adder).add(-3,-9);
    }

    @Test
    void addBy10_1(){
        final int input=5,expectation=15;
        doReturn(15).when(calculator).sum(input,10);
        int result=calculator.addBy10(5);
        assertEquals(expectation,result);
        verify(calculator).sum(input,10);
    }
}


