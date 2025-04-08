package maratona.Exercicios;

// 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo
// e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side A: ");
        int sideA = sc.nextInt();
        System.out.println("Side B: ");
        int sideB = sc.nextInt();
        System.out.println("Side C: ");
        int sideC = sc.nextInt();


        if (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA) {

        if (sideA == sideB && sideB == sideC){
            System.out.println("Equilateral");
        }
        else if (sideA != sideB && sideB != sideC && sideA != sideC){
            System.out.println("Scalene");
        } else {
            System.out.println("isosceles");
        }
    }else {
            System.out.println("Invalid triangle");
        }
        sc.close();
    }
}
