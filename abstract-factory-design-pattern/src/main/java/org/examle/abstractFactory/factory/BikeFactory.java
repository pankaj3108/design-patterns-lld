package org.examle.abstractFactory.factory;

import org.examle.abstractFactory.models.NormalBike;
import org.examle.abstractFactory.models.SportsBike;
import org.examle.abstractFactory.models.Vehicle;

public class BikeFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {

        if("Normal".equalsIgnoreCase(type))
            return new NormalBike();
        else if("Sports".equalsIgnoreCase(type))
            return new SportsBike();

        return new NormalBike();

    }
}
