package abstractFactoryMethod.models;

import abstractFactoryMethod.api.Car;

public class Audi implements Car {

    @Override
    public void buildCarBody() {
        System.out.println("Building Audi car body");
    }

    @Override
    public void assembleCar() {
        System.out.println("Assembling Audi car");
    }
}
