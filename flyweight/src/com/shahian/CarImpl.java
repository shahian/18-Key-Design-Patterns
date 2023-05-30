package com.shahian;

// Concrete flyweight class
public class CarImpl implements Car {
    private String brand;

    public CarImpl(String brand) {
        this.brand = brand;
    }

    @Override
    public void drive(String location) {
        System.out.println("Driving to " + location + " in a " + brand + " car.");
    }
}
