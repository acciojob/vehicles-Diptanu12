package com.driver;

public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
    }

    // Method signature updated to match usage
    public void changeSpeed(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}
