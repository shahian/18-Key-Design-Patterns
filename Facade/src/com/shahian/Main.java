package com.shahian;

// Client code
public class Main {

    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
        carFacade.stopCar();
    }
}
