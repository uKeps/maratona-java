package maratona.Exercicios;

// 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco

public class Exerc18 {
    public static void main(String[] args) {
    double francisco = 1.50;
    double sara = 1.10;

        int i;

        for (i = 0; sara <= francisco ; i++) {
            francisco += 0.02;
            sara += 0.03;
        }

        System.out.println("It will take " + i + " years for Sara to be bigger than Francisco");

    }
}
