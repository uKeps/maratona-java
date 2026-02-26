package maratona.Exercicios;

//22 - Faça um algoritmo que leia dois valores inteiros A e B,
// imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number A: ");
        int numberA = sc.nextInt();
        System.out.println("Number B: ");
        int numberB = sc.nextInt();

        int product = numberA / numberB;
        System.out.println("Quotient: " + product + " Remainder: " + (numberA % numberB));
    }
}
