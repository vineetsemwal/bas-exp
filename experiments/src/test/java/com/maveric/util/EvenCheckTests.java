package com.maveric.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenCheckTests {

    EvenCheck evenCheck;
    @BeforeEach
    public void setup(){
        evenCheck=new EvenCheck();
    }

    @ParameterizedTest
    @ValueSource(ints = {10,11,15,20})
    void even_1(final int num){
       boolean result= evenCheck.isEven(num);
        assertEquals(num%2==0,result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void even_2(final int num){
        boolean result= evenCheck.isEven(num);
        assertEquals(num%2==0,result);
    }

}
