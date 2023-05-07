package com.shahian;

public class Main {

    public static void main(String[] args) {
        // Create a regular car
        Car car = new CarImpl("Toyota", "Camry", "Black");
        car.accelerate();
        car.brake();
        car.turn();

        // Create an electric car
        ElectricCar tesla = new ElectricCarImpl("Tesla", "Model S", "Red");
        tesla.charge();
        tesla.electricAccelerate();
        tesla.electricBrake();


        // Adapt the electric car to work with the Car interface
        Car electricCarAdapter = new ElectricCarAdapter(tesla);
        electricCarAdapter.accelerate();
        electricCarAdapter.brake();
        electricCarAdapter.turn();
    }
}
