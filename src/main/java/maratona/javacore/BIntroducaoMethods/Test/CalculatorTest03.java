package maratona.javacore.BIntroducaoMethods.Test;

import maratona.javacore.BIntroducaoMethods.Domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 2);
        System.out.println(result);
        System.out.println(calculator.divideTwoNumbers02(20, 0));
        calculator.ImprimedivideTwoNumbers(86, 2);
    }
}
