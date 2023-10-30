package org.examle.abstractFactory.provider;

import org.examle.abstractFactory.factory.AbstractVehicleFactory;
import org.examle.abstractFactory.factory.BikeFactory;
import org.examle.abstractFactory.factory.CarFactory;

public class FactoryProvider {

    public static AbstractVehicleFactory getVehicleFactory(String factoryType) {

        if("Car".equalsIgnoreCase(factoryType))
            return new CarFactory();
        else if("Bike".equalsIgnoreCase(factoryType))
            return new BikeFactory();

        return new CarFactory();

    }
}
