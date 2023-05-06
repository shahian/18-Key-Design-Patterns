package com.shahian;

public class ElectricCarImpl implements ElectricCar {
    private String make;
    private String model;
    private String color;

    public ElectricCarImpl(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("Charging the electric car");
    }

    @Override
    public void electricAccelerate() {
        System.out.println("Accelerating the electric car");
    }

    @Override
    public void electricBrake() {
        System.out.println("Applying electric brakes");
    }

    // Getters and setters
}
