package com.maveric.util;

public class Calculator {

    private Adder adder;
    public Calculator(final Adder adder){
        this.adder=adder;
    }

   public int sum(final int num1, final int num2) {
      int result=adder.add(num1,num2);
      return result;
   }

    public int addBy10(final int num){
        return sum(num,10);
    }

}
