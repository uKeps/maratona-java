package maratona.EstCondicionais;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Donate 500 if salary > 5000
        double salary = 7000;
        String messageDonation = "I'll donate 500 reais";
        String messageNoDonation = "I won't donate 500 reais";
        // ternary operator (condition) ? true : false
        String result = salary > 5000 ? messageDonation : messageNoDonation;


        System.out.println(result);


    }
}
