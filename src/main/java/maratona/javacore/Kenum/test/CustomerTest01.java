package maratona.javacore.Kenum.test;

import maratona.javacore.Kenum.domain.Customer;
import maratona.javacore.Kenum.domain.CustomerType;
import maratona.javacore.Kenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa",  CustomerType.NATURAL_PERSON, PaymentType.CREDIT);
        Customer customer2 = new Customer("Akira", CustomerType.LEGAL_PERSON, PaymentType.DEBIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        CustomerType customerType = CustomerType.valueOf("NATURAL_PERSON");
        System.out.println(customerType.getNameReport());
        CustomerType customerType2 = CustomerType.CustomerTypeByReportName("Natural Person");
        System.out.println(customerType2);
    }
}
