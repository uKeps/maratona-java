package maratona.BIntroducaoMethods.Test;

import maratona.BIntroducaoMethods.Domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        calculator.changeTwoNumbers(a, b);
        System.out.println("Inside the test");
        System.out.println(a);
        System.out.println(b);
    }
}
