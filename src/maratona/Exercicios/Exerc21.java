package maratona.Exercicios;

//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

import java.util.Random;

public class Exerc21 {
    public static void main(String[] args) {
    Random random = new Random();
    int numberRandom = random.nextInt(100);
        System.out.println(numberRandom);
    }
}
