package org.examle.abstractFactory.models;

abstract class Bike implements Vehicle{

    String bikeType;
    int baseCost;
    int costPerKmDistance;

    public void bookRide(int distance) {

        setVehicleType();
        setBaseCost();
        setCostPerKmDistance();

        int cost = calculateFare(distance);

        System.out.println("You have booked a " + bikeType + " Bike for a distance of " + distance + " kms at a total cost of " + cost + ". ");

    }

    public int calculateFare(int distance) {
        return baseCost + costPerKmDistance * distance;
    }

}
