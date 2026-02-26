package maratona.Exercicios;

// 24- Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
// sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem
// a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//
//Fórmula: distância = tempo x velocidade.
//            litros usados = distância / 12.

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long: ");
        double time = sc.nextDouble();
        System.out.println("speed: ");
        double speed = sc.nextDouble();

        int kmPerLiter = 12;
        double distance = time * speed;
        double liters = distance / 12;

        System.out.println("Distance: " + distance + "km");
        System.out.println("Used liters: " + liters);
    }
}
