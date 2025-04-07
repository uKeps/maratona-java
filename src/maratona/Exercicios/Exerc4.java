package maratona.Exercicios;


// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.


import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int number = sc.nextInt();

        System.out.println("Predecessor: " + (number - 1));
        System.out.println("Successor: " + (number + 1));
    }
}
