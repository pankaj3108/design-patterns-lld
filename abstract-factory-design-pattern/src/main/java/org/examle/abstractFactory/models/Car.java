package org.examle.abstractFactory.models;

abstract class Car implements Vehicle {
    String carType;

    int baseCost;

    int costPerKmDistance;

    @Override
    public void bookRide(int distance) {

        setVehicleType();
        setBaseCost();
        setCostPerKmDistance();

        int cost = calculateFare(distance);

        System.out.println("You have booked a " + carType + " Car for a distance of " + distance + " kms at a total cost of " + cost + ". ");

    }

    @Override
    public int calculateFare(int distance) {
        int serviceCharge = 3;
        return baseCost + costPerKmDistance * distance + serviceCharge;
    }
}
