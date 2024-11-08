package com.maveric;

import com.maveric.util.Adder;
import com.maveric.util.Calculator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator=new Calculator(new Adder());
        int output=calculator.sum(3,6);
        System.out.println(output);
    }
}
