package maratona.EstRepeticao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        int car = 30000;
        // i = installments

        for (int installments = 1; installments <= car ; installments++) {
            double installmentsValue = car/installments;
            if (installmentsValue < 1000) {
                break;
            }
            System.out.println("Installments: " + installments + " - Value: " + installmentsValue);
        }

    }
}
