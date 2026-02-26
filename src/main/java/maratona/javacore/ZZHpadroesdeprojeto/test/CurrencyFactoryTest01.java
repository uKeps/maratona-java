package maratona.javacore.ZZHpadroesdeprojeto.test;

import maratona.javacore.ZZHpadroesdeprojeto.domain.Country;
import maratona.javacore.ZZHpadroesdeprojeto.domain.Currency;
import maratona.javacore.ZZHpadroesdeprojeto.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
