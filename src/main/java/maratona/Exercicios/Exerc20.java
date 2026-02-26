package maratona.Exercicios;

//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int number = sc.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(number + "X" + i + "=" + (number * i));
        }
    }
}
