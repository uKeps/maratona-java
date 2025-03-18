package maratona.BIntroducaoMethods.Test;

import maratona.BIntroducaoMethods.Domain.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Notebook";
        product.price = 2500;
        System.out.println( product.name + " " + product.price);

        product.updatePrice(1500);
        System.out.println( product.name + " " + product.price);
    }
}
