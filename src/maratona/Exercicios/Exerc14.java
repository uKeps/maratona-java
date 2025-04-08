package maratona.Exercicios;

//14 - Faça um algoritmo que receba um valor A e B, e troque o
// valor de A por B e o valor de B por A e imprima na tela os valores.

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        int a = sc.nextInt();
        System.out.println("B: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A: "+ a + " B: " + b );
    }
}
