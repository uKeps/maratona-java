package maratona.EstRepeticao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        int car = 30000;
        // i = installments

        for (int installments = (int) car; installments >= 1 ; installments--) {
            double installmentsValue = car/installments;
            if (installmentsValue < 1000) {
                continue;
            }
            System.out.println("Installments: " + installments + " - Value: " + installmentsValue);
        }

    }
}
