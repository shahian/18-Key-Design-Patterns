package com.shahian;

public class Sedan extends Car {
    public Sedan(Color color) {
        super(color);
    }

    @Override
    public void drive() {
        System.out.println("Driving a sedan car");
    }
}
