package com.shahian;

public class SUV extends Car{
    public SUV(Color color) {
        super(color);
    }

    @Override
    public void drive() {
        System.out.println("Driving an SUV");
    }
}
