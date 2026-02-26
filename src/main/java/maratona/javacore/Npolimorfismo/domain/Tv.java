package maratona.javacore.Npolimorfismo.domain;

public class Tv extends Product{
    public static final double TAX_PERCENT = 0.21;
    public Tv(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating Tv tax");
        return this.value * TAX_PERCENT;
    }

}
