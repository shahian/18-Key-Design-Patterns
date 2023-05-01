package com.shahian;

public class Car {
    private String engine;
    private int wheels;
    private int doors;
    private String color;

    public Car(String engine, int wheels, int doors, String color) {
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                '}';
    }
}