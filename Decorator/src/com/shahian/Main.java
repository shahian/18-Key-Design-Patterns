package com.shahian;

public class Main {

    public static void main(String[] args) {

        Car basicCar = new BasicCar();
        Car carWithSunroof=new SunroofDecorator(basicCar);
        carWithSunroof.assemble();
        Car carWithAlloyWheels=new AlloyWheelsDecorator(basicCar);
        carWithAlloyWheels.assemble();
        Car carWithSunroofAndAlloyWheels=new AlloyWheelsDecorator(new SunroofDecorator(basicCar));
        carWithSunroofAndAlloyWheels.assemble();


    }
}
