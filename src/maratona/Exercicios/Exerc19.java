package maratona.Exercicios;

//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Exerc19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Multiplication table of " + i + ":");
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + "X" + j + "=" + (i*j));
            }
            System.out.println();
        }
    }
}
