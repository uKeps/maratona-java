package maratona.javacore.Npolimorfismo.test;

import maratona.javacore.Npolimorfismo.domain.Computer;
import maratona.javacore.Npolimorfismo.domain.Product;
import maratona.javacore.Npolimorfismo.domain.Tomato;
import maratona.javacore.Npolimorfismo.domain.Tv;
import maratona.javacore.Npolimorfismo.service.CalculatorTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("INTELi7", 11000);
        Tomato tomato = new Tomato("Sicilian Tomato", 10);
        Tv tv = new Tv("Samsung 50\" ",5000);
        CalculatorTax.calculateTax(tomato);
        System.out.println("----------------");
        CalculatorTax.calculateTax(computer);
        System.out.println("----------------");
        CalculatorTax.calculateTax(tv);
    }
}
