package maratona.Exercicios;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grade 1: ");
        double grade1 = sc.nextDouble();
        System.out.println("Grade 2: ");
        double grade2 = sc.nextDouble();
        System.out.println("Grade 3: ");
        double grade3 = sc.nextDouble();
        double sum = 0;

        double grades[] = {grade1,grade2,grade3};
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        System.out.println("average: " + average);
        sc.close();
    }
}
