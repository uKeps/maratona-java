package maratona.javacore.Npolimorfismo.service;

import maratona.javacore.Npolimorfismo.domain.Computer;
import maratona.javacore.Npolimorfismo.domain.Product;
import maratona.javacore.Npolimorfismo.domain.Tomato;

public class CalculatorTax {
    public static void calculateTax(Product product){
        System.out.println("Tax report");
        double tax = product.calculateTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Tax to be paid: " + tax);
        if(product instanceof Tomato){
        Tomato tomato = (Tomato) product;
        System.out.println(tomato.getExpirationDate());
        }
    }
}
