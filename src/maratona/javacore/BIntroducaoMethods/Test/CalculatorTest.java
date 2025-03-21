package maratona.javacore.BIntroducaoMethods.Test;

import maratona.javacore.BIntroducaoMethods.Domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        System.out.println("Shutting down the calculator");
        calculator.subtractTwoNumbers();
    }
}
