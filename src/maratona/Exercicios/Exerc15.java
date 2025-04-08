package maratona.Exercicios;

//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu.
// Leve em consideração o ano com 365 dias e o mês com 30 dias.
//(Ex: 5 anos, 2 meses e 15 dias de vida)

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exerc15OO exerc15OO = new Exerc15OO(7,4,2025);
        System.out.println("Year of birth: ");
        int yearBirth = sc.nextInt();
        System.out.println("Day of birth: ");
        int dayBirth = sc.nextInt();
        System.out.println("Month of birth: ");
        int monthBirth = sc.nextInt();

        int year = exerc15OO.yearCurrent - yearBirth;
        int day = exerc15OO.dayCurrent - dayBirth;
        int month = exerc15OO.monthCurrent - monthBirth;

        if (day < 0) {
            day += 30;
            month--;
        }

        if (month < 0) {
            month += 12;
            year--;
        }

        System.out.println(year+ " Year");
        System.out.println(day+ " days");
        System.out.println(month+ " months");
    }
}
