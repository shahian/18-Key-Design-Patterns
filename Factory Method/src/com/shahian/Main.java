package com.shahian;

public class Main {

    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        CarFactory suvFactory = new SUVFactory();

        Car sedan = sedanFactory.createCar();
        Car suv = suvFactory.createCar();

        System.out.println(sedan.getName() + " with " + sedan.getNumDoors() + " doors"); // Output: "Sedan with 4 doors"
        System.out.println(suv.getName() + " with " + suv.getNumDoors() + " doors"); // Output: "SUV with 5 doors"
    }
}
