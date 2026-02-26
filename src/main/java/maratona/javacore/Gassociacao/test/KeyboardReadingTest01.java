package maratona.javacore.Gassociacao.test;

import java.util.Scanner;

public class KeyboardReadingTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = sc.nextLine();
        System.out.println("What's your age? ");
        int age = sc.nextInt();
        System.out.println("What's your gender? (F or M) ");
        char gender = sc.next().charAt(0);
        System.out.println("------------------------");
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
        sc.close();
    }
}
