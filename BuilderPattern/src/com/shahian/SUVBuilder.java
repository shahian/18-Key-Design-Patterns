package com.shahian;

public class SUVBuilder implements CarBuilder {
    private String engine;
    private int wheels;
    private int doors;
    private String color;

    public void addEngine(String engine) {
        this.engine = engine;
    }

    public void addWheels(int wheels) {
        this.wheels = wheels;
    }

    public void addDoors(int doors) {
        this.doors = doors;
    }

    public void addColor(String color) {
        this.color = color;
    }

    public Car build() {
        // Add custom values for SUV
        engine = "V6";
        wheels = 4;
        doors = 5;
        color = "Blue";

        return new Car(engine, wheels, doors, color);
    }
}
