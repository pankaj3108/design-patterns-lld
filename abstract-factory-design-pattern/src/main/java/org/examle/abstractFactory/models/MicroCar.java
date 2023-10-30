package org.examle.abstractFactory.models;

public class MicroCar extends Car{

    @Override
    public void setVehicleType() {
        carType = "Micro";
    }

    @Override
    public void setBaseCost() {
        baseCost = 50;
    }

    @Override
    public void setCostPerKmDistance() {
        costPerKmDistance = 10;
    }
}
