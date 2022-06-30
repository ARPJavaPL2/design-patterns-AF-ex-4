package abstractFactoryMethod.factories;

import abstractFactoryMethod.api.Car;
import abstractFactoryMethod.models.Audi;

public class AudiFactory extends AbstractCarFactory {

    @Override
    public Car createAssembledCar() {
        System.out.println("Creating brand new Audi A8.");
        Audi audi = new Audi();
        audi.buildCarBody();
        audi.assembleCar();
        return audi;
    }
}
