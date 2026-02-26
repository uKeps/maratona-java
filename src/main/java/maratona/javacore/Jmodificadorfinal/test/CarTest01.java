package maratona.javacore.Jmodificadorfinal.test;

import maratona.javacore.Jmodificadorfinal.domain.Buyer;
import maratona.javacore.Jmodificadorfinal.domain.Car;
import maratona.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Kuririn");
        System.out.println(car.BUYER);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Daytona");
        ferrari.print();
    }
}
