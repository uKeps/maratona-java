package maratona.Exercicios;

//23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e
// percentual de desconto do INSS. Imprima na tela o salário líquido final.

import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hour value: ");
        double hourValue = sc.nextDouble();
        System.out.println("classes in the month: ");
        double classesMonth = sc.nextDouble();
        System.out.println("INSS discount (%): ");
        double inssDiscount = sc.nextDouble();

        double grossSalary= hourValue * classesMonth;
        double discount = grossSalary * (inssDiscount / 100);
        double liquidSalary = grossSalary - discount;

        System.out.println("Salary: " + liquidSalary);
    }
}
