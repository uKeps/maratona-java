package maratona.javacore.Npolimorfismo.test;

import maratona.javacore.Npolimorfismo.domain.Computer;
import maratona.javacore.Npolimorfismo.domain.Product;
import maratona.javacore.Npolimorfismo.domain.Tomato;
import maratona.javacore.Npolimorfismo.service.CalculatorTax;

public class ProductTest03 {
    public static void main(String[] args) {

    Product product = new Computer("Ryzen 9", 3000);

    Tomato tomato = new Tomato("American", 20);
    tomato.setExpirationDate("yesterday :/");

        CalculatorTax.calculateTax(tomato);
        System.out.println("---------------------------");
        CalculatorTax.calculateTax(product);

    }
}
