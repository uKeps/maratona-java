package maratona.Exercicios;

//  11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
//  imprima na tela o nome do aluno e
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado
// sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double grades[] = new double[4];
    double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade: " + (i + 1));
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }
        double average = sum / grades.length;
        System.out.println("average: " + average);

        if (average >= 7){
            System.out.println("Approved");
        }else {
            System.out.println("Reproved");
        }

        sc.close();
    }
}
