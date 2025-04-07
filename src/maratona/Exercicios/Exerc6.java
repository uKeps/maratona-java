package maratona.Exercicios;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        double number = sc.nextDouble();

        double readjust = 0.05;

        System.out.println(number + (number * readjust));
    }
}
