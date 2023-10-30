package org.examle.abstractFactory.models;

public interface Vehicle {

    void bookRide(int distance);

    void setVehicleType();

    void setBaseCost();

    void setCostPerKmDistance();

    int calculateFare(int distance);
}
