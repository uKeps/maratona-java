package maratona.Exercicios;
//2 - Faça um algoritmo para receber um número qualquer e imprimir
// na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }

        if(number < 0){
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}
