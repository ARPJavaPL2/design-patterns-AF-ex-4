package abstractFactoryMethod;

import abstractFactoryMethod.factories.AudiFactory;
import abstractFactoryMethod.factories.CarFactory;
import abstractFactoryMethod.factories.MercedesFactory;

public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        carFactory.produceAssembledCar(new MercedesFactory());
        carFactory.produceAssembledCar(new AudiFactory());

    }
}
