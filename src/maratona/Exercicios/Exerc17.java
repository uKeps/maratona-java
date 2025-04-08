package maratona.Exercicios;

// 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
// Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fahrenheit temperature: ");
        int fahrenheit = sc.nextInt();
        int celcius = (5 *(fahrenheit-32)/9);
        System.out.println("Fahrenheit temperature :" + fahrenheit);
        System.out.println("Celcius temperature :" + celcius);
    }
}
