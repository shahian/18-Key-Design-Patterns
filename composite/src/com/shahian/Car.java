package com.shahian;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarComponent{
    private List<CarComponent>components;
    public Car(){
        this.components=new ArrayList<>();
    }
    public void addComponent(CarComponent component){
        components.add(component);
    }
    public void removeComponent(CarComponent component){
        components.add(component);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the Car..");
        for(CarComponent component:components){
            component.assemble();
        }
        System.out.println("Car Assembly  Complete...");

    }
}
