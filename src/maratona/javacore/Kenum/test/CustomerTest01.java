package maratona.javacore.Kenum.test;

import maratona.javacore.Kenum.domain.Customer;
import maratona.javacore.Kenum.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa",  CustomerType.NATURAL_PERSON);
        Customer customer2 = new Customer("Akira", CustomerType.LEGAL_PERSON);

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
