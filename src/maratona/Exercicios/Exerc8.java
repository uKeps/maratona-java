package maratona.Exercicios;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Arrays;
import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Write 3 values");
        System.out.println("Value A: ");
        int a = sc.nextInt();

        System.out.println("Value B: ");
        int b = sc.nextInt();
        System.out.println("Value C: ");
        int c = sc.nextInt();
        int[] numbers = {a,b,c};
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
