package org.examle.abstractFactory.models;

public class SportsBike extends Bike{
    @Override
    public void setVehicleType() {
        bikeType = "Sports";
    }

    @Override
    public void setBaseCost() {
        baseCost = 15;
    }

    @Override
    public void setCostPerKmDistance() {
        costPerKmDistance = 8;
    }
}
