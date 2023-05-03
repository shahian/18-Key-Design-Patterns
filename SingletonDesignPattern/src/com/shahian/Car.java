package com.shahian;

public class Car {
    private static Car instance;
    private String make;
    private String model;
    private String color;

    private Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public static Car getInstance(String make, String model, String color) {
        if (instance == null) {
            instance = new Car(make, model, color);
        }
        return instance;
    }

    // getters and setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void resetInstance() {
        instance = null;
    }
    @Override
    public String toString() {
        return "Make: " + this.make + ", Model: " + this.model + ", Color: " + this.color;
    }
}