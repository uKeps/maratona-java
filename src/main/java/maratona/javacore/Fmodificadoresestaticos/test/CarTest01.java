package maratona.javacore.Fmodificadoresestaticos.test;

import maratona.javacore.Fmodificadoresestaticos.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 280);
        Car car2 = new Car("Mercedes", 275);
        Car car3 = new Car("Audi", 290);
        Car.setSpeedLimit(300);
        car1.print();
        car2.print();
        car3.print();
    }
}
