package maratona.Exercicios;


//3 - Faça um algoritmo que leia dois valores inteiros A e B,
// se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B. Ao final de qualquer
// um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Value A: ");
        int a = sc.nextInt();
        System.out.println("Value B: ");
        int b = sc.nextInt();
        int result;

        if(a == b){
            result = a + b;
            System.out.println("Sum: " + result);
        } else {
            result = a * b;
            System.out.println("Product: " + result);
        }
    }
}
