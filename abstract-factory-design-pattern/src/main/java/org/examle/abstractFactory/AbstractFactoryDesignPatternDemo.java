package org.examle.abstractFactory;

import org.examle.abstractFactory.factory.AbstractVehicleFactory;
import org.examle.abstractFactory.models.Vehicle;
import org.examle.abstractFactory.provider.FactoryProvider;

public class AbstractFactoryDesignPatternDemo {

    public static void main(String[] args) {

        int distance = 10;

        // Book Car Ride
        AbstractVehicleFactory carVehicleFactory = FactoryProvider.getVehicleFactory("car");

        Vehicle microCar = carVehicleFactory.getVehicle("micro");

        microCar.bookRide(10);

        // Book Bike Ride
        AbstractVehicleFactory bikeVehicleFactory = FactoryProvider.getVehicleFactory("bike");

        Vehicle sportsBike = bikeVehicleFactory.getVehicle("sports");

        sportsBike.bookRide(10);
    }
}
