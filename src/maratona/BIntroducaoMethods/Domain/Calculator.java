package maratona.BIntroducaoMethods.Domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(5 + 5);
    }

    public void subtractTwoNumbers() {
        System.out.println(5 - 5);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void ImprimedivideTwoNumbers(double num1, double num2) {
        if (num2 == 0){
            System.out.println("Não é possível dividir por zero");
            return;
        }
        System.out.println(num1/num2);

    }

    public void changeTwoNumbers(int number1, int number2){
        number1 = 99;
        number2 = 33;
        System.out.println("Inside the method");
        System.out.println("num1: " + number1);
        System.out.println("num2: " + number2);
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }

    // Desafio: criar uma calculadora que valida se o numero é primo ou nao
    // return true se for primo, false se nao for

    //desafio 2: criar uma calculadora que recebe uma lista/array
    // e retorna a lista x2
//    public boolean validatePrimeNumber(int number){
//        if (number <= 1){
//            return false;
//        }
//        for (int i = 2; i <= (number/2); i++){
//            if (number % i == 0){
//                return false;
//            }
//        } return true;
// }
}
