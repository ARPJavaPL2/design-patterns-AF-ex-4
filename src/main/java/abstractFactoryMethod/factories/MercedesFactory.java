package abstractFactoryMethod.factories;

import abstractFactoryMethod.api.Car;
import abstractFactoryMethod.models.Mercedes;

public class MercedesFactory extends AbstractCarFactory {

    @Override
    public Car createAssembledCar() {
        System.out.println("Creating brand new Mercedes CLS.");
        Mercedes mercedes = new Mercedes();
        mercedes.buildCarBody();
        mercedes.assembleCar();
        return mercedes;
    }

}
