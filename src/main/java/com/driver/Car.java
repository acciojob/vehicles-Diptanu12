package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private String type;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; // Default gear is 1
        this.type = type;
        this.seats = seats;
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    // Override to match the parent class method
    @Override
    public void changeSpeed(int speed, int direction) {
        super.changeSpeed(speed, direction);
    }
}
