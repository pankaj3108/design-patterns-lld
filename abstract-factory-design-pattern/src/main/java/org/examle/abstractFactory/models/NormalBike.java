package org.examle.abstractFactory.models;

public class NormalBike extends Bike{
    @Override
    public void setVehicleType() {
        bikeType = "Normal";
    }

    @Override
    public void setBaseCost() {
        baseCost = 10;
    }

    @Override
    public void setCostPerKmDistance() {
        costPerKmDistance = 5;
    }
}
