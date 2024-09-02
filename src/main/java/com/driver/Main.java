package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        Car car = new Car("Sedan", 4, 4, 5, true, "Luxury", 5);
        F1 f1 = new F1("Ferrari", true);

        // Using Vehicle
        vehicle.move(60, 90);
        vehicle.steer(30);
        vehicle.stop();

        // Using Car
        car.changeGear(3);
        car.changeSpeed(80, 45);

        // Using F1
        f1.accelerate(70);
        f1.accelerate(-50);
    }
}
