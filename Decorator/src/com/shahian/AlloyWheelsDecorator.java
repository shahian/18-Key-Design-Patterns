package com.shahian;

public class AlloyWheelsDecorator extends CarDecorator{
    public AlloyWheelsDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding Alloy Wheels");
    }
}
