package maratona.Exercicios;

//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
// leia o seu peso e sua altura e imprima na tela sua condição
//de acordo com a tabela abaixo:
//
//Fórmula do IMC = peso / (altura) ²
//
//Tabela Condições IMC
// Abaixo de 18,5   | Abaixo do peso
//
// Entre 18,6 e 24,9 | Peso ideal (parabéns)
//
// Entre 25,0 e 29,9 | Levemente acima do peso
//
// Entre 30,0 e 34,9 | Obesidade grau I
//
// Entre 35,0 e 39,9 | Obesidade grau II (severa)
//
// Maior ou igual a 40 | Obesidade grau III (mórbida)

import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your weight(kg) ");
        double weight = sc.nextDouble();
        System.out.println("Your height(1,76 example) ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);

        System.out.printf("BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Ideal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Slightly overweight");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obesity grade I");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Obesity grade II");
        } else {
            System.out.println("Obesity grade III (morbid)");
        }
    }
}
