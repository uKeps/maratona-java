package maratona.AIntroducaoClasses.test;

import maratona.AIntroducaoClasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.brand = "Lamborghini";
        car.name = "Revuelto";
        car.year = 2024;

        car2.brand = "Ferrari";
        car2.name = "SF90";
        car2.year = 2024;

        car = car2; // car2 is now pointing to the same object as car1

        System.out.println("Car 1");
        System.out.println("Brand: " + car.brand + "\n Name: " + car.name + "\n Year: " + car.year);
        System.out.println("\nCar 2");
        System.out.println("Brand: " + car2.brand + "\n Name: " + car2.name + "\n Year: " + car2.year);
    }
}
