package com.shahian;

public class CarImpl implements Car {
    private String make;
    private String model;
    private String color;

    public CarImpl(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the car");
    }

    @Override
    public void brake() {
        System.out.println("Applying brakes");
    }

    @Override
    public void turn() {
        System.out.println("Turning the car");
    }
}