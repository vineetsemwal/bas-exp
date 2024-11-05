package program_for_contracts;

public class SamsungCalculator implements ICalculator{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
