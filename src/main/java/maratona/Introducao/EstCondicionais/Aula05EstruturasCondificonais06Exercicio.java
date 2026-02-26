package maratona.Introducao.EstCondicionais;

import java.util.Scanner;

public class Aula05EstruturasCondificonais06Exercicio {
    public static void main(String[] args) {
        // Switch exercise
        // given the numbers 1 to 7, print if it is a weekday or weekend
        // 1 = Sunday
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7: ");
        int day = sc.nextByte();

        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid day");
        }
//        switch (day) {
//            case 1:
//                System.out.println("Sunday - Weekend");
//                break;
//            case 2:
//                System.out.println("Monday - Weekday");
//                break;
//            case 3:
//                System.out.println("Tuesday - Weekday");
//                break;
//            case 4:
//                System.out.println("Wednesday - Weekday");
//                break;
//            case 5:
//                System.out.println("Thursday - Weekday");
//                break;
//            case 6:
//                System.out.println("Friday - Weekday");
//                break;
//            case 7:
//                System.out.println("Saturday - Weekend");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
    }
}
