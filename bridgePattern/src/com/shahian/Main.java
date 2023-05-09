package com.shahian;

public class Main {

    public static void main(String[] args) {
        Car sedan = new Sedan(new BlueColor());
        sedan.drive();
        sedan.color.applyColor();
        Car suv = new SUV(new RedColor());
        suv.drive();
        suv.color.applyColor();
    }
}
