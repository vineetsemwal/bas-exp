package program_for_contracts;

import java.util.LinkedList;

public class CalculatorUsage {
    public static void main(String[] args) {
       ICalculator calculator=new CasioCalculator();
        int result=calculator.add(1,5);
        System.out.println("result="+result);

    }
}
