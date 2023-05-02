package com.shahian;

public abstract class Car implements Cloneable {
    private String make;
    private String model;
    private String color;

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

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
    @Override
    public Car clone()throws CloneNotSupportedException{
        return (Car) super.clone();
    }
    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Color: " + color;
    }
}
