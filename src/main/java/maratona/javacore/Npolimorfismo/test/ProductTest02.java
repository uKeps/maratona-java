package maratona.javacore.Npolimorfismo.test;

import maratona.javacore.Npolimorfismo.domain.Computer;
import maratona.javacore.Npolimorfismo.domain.Product;
import maratona.javacore.Npolimorfismo.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {

    Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calculateTax());

        Product product2 = new Tomato("American", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calculateTax());
    }
}
