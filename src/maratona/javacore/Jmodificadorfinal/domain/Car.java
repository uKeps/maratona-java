package maratona.javacore.Jmodificadorfinal.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Buyer BUYER = new Buyer();

    public final void print(){
        System.out.println(this.name);
    }

    public Buyer getBUYER() {
        return BUYER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
