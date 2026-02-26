package maratona.Exercicios;

//13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela
// o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name? ");
        String person = sc.nextLine();
        System.out.println("How old are u? ");
        int age = sc.nextInt();

        if (age < 18){
            System.out.println(person + " isn't of legal age");
        } else {
            System.out.println(person + " is of legal age");
        }
    }
}
