package maratona.Exercicios;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima
// na tela a soma entre A e B é mostre se a soma é menor que C.
public class Exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value A: ");
        int a = sc.nextInt();
        System.out.println("Value B: ");
        int b = sc.nextInt();
        System.out.println("Value C: ");
        int c = sc.nextInt();
        int sum = a + b;

        if (sum < c) {
            System.out.println("The sum is less than C");
        }
        System.out.println("A + B = " + sum);
    }
}
