package com.shahian;

public class SportsCar extends Car{
    public SportsCar(String make, String model, String color) {
        super(make, model, color);
    }
    public void addSpoiler() {
        System.out.println("Adding a spoiler to the " + getMake() + " " + getModel());
    }

    public void addRacingStripes() {
        System.out.println("Adding racing stripes to the " + getMake() + " " + getModel());
    }

}
