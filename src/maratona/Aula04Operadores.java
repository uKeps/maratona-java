package maratona;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero02 = 20;
        int numero01 = 10;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // %
        int resto = 22 % 7;
        System.out.println(resto);

        // < > <= >= == != todos retornam boolean

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        System.out.println(isDezMaiorQueVinte);
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMenorQueVinte + " isDezMenorQueVinte");
        System.out.println(isDezIgualQueVinte + " isDezIgualQueVinte");
        System.out.println(isDezIgualDez+ " isDezIgualDez");
        System.out.println(isDezDiferenteDez+ " isDezDiferenteDez");

        // && (and), || (or), ! (not)
        int age = 30;
        float salary = 3500f;
        boolean isWithinTheLawMoreThanThirty = age > 30 && salary >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("isWithinTheLawMoreThanThirty "+isWithinTheLawMoreThanThirty);
        System.out.println("isWithinTheLawLessThanThirty "+isWithinTheLawLessThanThirty);
       /* if (isWithinTheLawLessThanThirty == true) {
            System.out.println("Nice");
        } else {
            System.out.println("Not nice");
        }*/

        double totalValueCheckingAccount = 200;
        double totalValueSavingsAccount = 10000;
        float playstationFiveValue = 5000f;

        boolean isPlaystationFivePurchasable = totalValueCheckingAccount > playstationFiveValue || totalValueSavingsAccount > playstationFiveValue;
        System.out.println("isPlaystationFivePurchasable "+isPlaystationFivePurchasable);

        // =, +=, -=, *=, /=, %=
        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        System.out.println(bonus);

        // ++, --
        int counter = 0;
        counter += 1;
        counter++;
        counter--;
        ++counter;
        --counter;
        int counter2 = 0;
        System.out.println(++counter2);
    }
}
