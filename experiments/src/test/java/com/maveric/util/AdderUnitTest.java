package com.maveric.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderUnitTest {
    Adder adder;
    @BeforeEach
    public void start(){
        adder=new Adder();
    }

    @Test
    public void add_1(){
        final int input1=2,input2=5;
        final int expectation=7;
        int result=adder.add(input1, input2);
        assertEquals(expectation,result);

    }

}
