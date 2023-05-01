package com.shahian;

public class Main {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        Car sportsCar = factory.buildCar(sportsCarBuilder);
        System.out.println(sportsCar);
        CarBuilder suvBuilder = new SUVBuilder();
        Car suv = factory.buildCar(suvBuilder);
        System.out.println(suv);

        CarBuilder sedanBuilder = new SedanBuilder();
        Car sedan = factory.buildCar(sedanBuilder);
        System.out.println(sedan);
    }
}
