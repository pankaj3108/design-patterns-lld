package org.examle.abstractFactory.factory;

import org.examle.abstractFactory.models.Vehicle;

public abstract class AbstractVehicleFactory {

    public abstract Vehicle getVehicle(String type);
}
