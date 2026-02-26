package maratona.Exercicios;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is Erik beautiful?(true or false) ");
        boolean answer = sc.nextBoolean();

        if(answer){
            System.out.println("Of course i am \uD83D\uDE0E");
        } else {
            System.out.println("nah, you must be blind");
        }
    }
}
