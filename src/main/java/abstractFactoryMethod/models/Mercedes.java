package abstractFactoryMethod.models;

import abstractFactoryMethod.api.Car;

public class Mercedes implements Car {

    @Override
    public void buildCarBody() {
        System.out.println("Building Mercedes car body");
    }

    @Override
    public void assembleCar() {
        System.out.println("Assembling Mercedes car");
    }
}
