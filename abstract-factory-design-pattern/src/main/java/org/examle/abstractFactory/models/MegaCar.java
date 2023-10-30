package org.examle.abstractFactory.models;

public class MegaCar extends Car{
    @Override
    public void setVehicleType() {
        carType = "Mega";
    }

    @Override
    public void setBaseCost() {
        baseCost = 150;
    }

    @Override
    public void setCostPerKmDistance() {
        costPerKmDistance = 30;
    }
}
