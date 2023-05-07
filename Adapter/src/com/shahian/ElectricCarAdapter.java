package com.shahian;

public class ElectricCarAdapter implements Car {
    private ElectricCar electricCar;

    public ElectricCarAdapter(ElectricCar electricCar) {
        this.electricCar = electricCar;
    }

    @Override
    public void accelerate() {
        electricCar.electricAccelerate();
    }

    @Override
    public void brake() {
        electricCar.electricBrake();
    }

    @Override
    public void turn() {
        System.out.println("Turning the electric car");
    }
}