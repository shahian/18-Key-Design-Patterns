package com.shahian;

public class SunroofDecorator extends CarDecorator{
    public SunroofDecorator(Car car) {
        super(car);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding sunRoof");
    }
}
