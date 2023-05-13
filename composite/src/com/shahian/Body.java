package com.shahian;

import java.util.ArrayList;
import java.util.List;

public class Body implements CarComponent {
    private List<CarComponent> components;

    public Body() {
        this.components = new ArrayList<>();
    }

    public void addComponent(CarComponent component) {
        components.add(component);
    }

    public void removeComponent(CarComponent component) {
        components.remove(component);
    }

    @Override
    public void assemble() {
        System.out.println("Assembly the Body");
        for (CarComponent component : components) {
            component.assemble();

            System.out.println("Body Assembly Complete.");
        }
    }
}
