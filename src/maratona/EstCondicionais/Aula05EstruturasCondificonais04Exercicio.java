package maratona.EstCondicionais;

public class Aula05EstruturasCondificonais04Exercicio {
    public static void main(String[] args) {
        // i want to know how much I have to pay in the Netherlands 2020 based on my annual salary
        double salary = 25000;
        double tax;

        if (salary <= 34712) {
            tax = 0.097;
        } else if (salary >= 34713 && salary <= 68507) {
            tax = 3.735;
        } else {
            tax = 4.950;
        }
        double salaryAfterTax = salary * tax;
        System.out.println(salary - salaryAfterTax);
    }
}
