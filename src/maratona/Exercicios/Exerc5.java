package maratona.Exercicios;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
// calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Salary: ");
    double salaryUser = sc.nextDouble();
    double salaryMin = 1293;

    double salaryFinal = salaryUser / salaryMin;
    System.out.printf("Amount of minimum wages you earn: %.2f%n", salaryFinal);
    }
}
