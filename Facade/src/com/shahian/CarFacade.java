package com.shahian;

// Car Facade
public class CarFacade {
    private Engine engine;
    private FuelSystem fuelSystem;
    private IgnitionSystem ignitionSystem;

    public CarFacade() {
        this.engine = new Engine();
        this.fuelSystem = new FuelSystem();
        this.ignitionSystem = new IgnitionSystem();
    }

    public void startCar() {
        fuelSystem.openValue();
        engine.start();
        ignitionSystem.ignite();
        System.out.println("Car Started");
    }

    public void stopCar() {
        engine.stop();
        ignitionSystem.extinguish();
        fuelSystem.closeValue();
        System.out.println("Car Stoped");
    }
}
