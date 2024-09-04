package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        Car car = new Car("Sedan", 4, 4, 5, true, "Luxury", 5);
        F1 f1 = new F1("Ferrari", true);

        // Using Vehicle
        System.out.println("Vehicle:");
        vehicle.changeSpeed(60, 90); // Changes speed and direction
        System.out.println("Vehicle Speed: " + vehicle.getCurrentSpeed());
        System.out.println("Vehicle Direction: " + vehicle.getCurrentDirection());
        vehicle.steer(30); // Steer direction
        System.out.println("Vehicle Direction after steering: " + vehicle.getCurrentDirection());
        vehicle.stop(); // Stop the vehicle
        System.out.println("Vehicle Speed after stopping: " + vehicle.getCurrentSpeed());

        // Using Car
        System.out.println("\nCar:");
        car.changeGear(3); // Change gear
        car.changeSpeed(80, 45); // Change speed and direction
        System.out.println("Car Speed: " + car.getCurrentSpeed());
        System.out.println("Car Direction: " + car.getCurrentDirection());
        System.out.println("Car Current Gear: " + car.getCurrentGear());

        // Using F1
        System.out.println("\nF1:");
        f1.changeSpeed(70, 45); // Accelerate F1 car
        System.out.println("F1 Speed: " + f1.getCurrentSpeed());
        System.out.println("F1 Direction: " + f1.getCurrentDirection());
        f1.changeSpeed(20, 45); // Accelerate F1 car to a lower speed
        System.out.println("F1 Speed after slowing down: " + f1.getCurrentSpeed());
    }
}
