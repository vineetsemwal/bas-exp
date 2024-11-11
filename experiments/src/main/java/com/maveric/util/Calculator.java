package com.maveric.util;

public class Calculator {

    private Adder adder;
    public Calculator(final Adder adder){
        this.adder=adder;
    }

   public int sum(final int num1, final int num2) {
       System.out.println("****inside sum of calculator");
      int result=adder.add(num1,num2);
      return result;
   }

    public int addBy10(final int num){
        System.out.println("****inside addBy10 of calculator");
        return sum(num,10);
    }

}
