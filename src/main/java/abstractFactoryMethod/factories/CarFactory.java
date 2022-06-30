package abstractFactoryMethod.factories;

import abstractFactoryMethod.api.Car;

public class CarFactory {

    public void produceAssembledCar(AbstractCarFactory abstractCarFactory) {
        Car car = abstractCarFactory.createAssembledCar();
        System.out.println("Produced car: " + car.toString());
    }

}
