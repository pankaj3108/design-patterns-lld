package org.examle.abstractFactory.factory;

import org.examle.abstractFactory.models.MegaCar;
import org.examle.abstractFactory.models.MicroCar;
import org.examle.abstractFactory.models.Vehicle;

public class CarFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {

        if("Micro".equalsIgnoreCase(type))
            return new MicroCar();
        else if("Mega".equalsIgnoreCase(type))
            return new MegaCar();

        return new MicroCar();

    }
}
