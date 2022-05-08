package com.mycompany.assignment3.abstraction;

public abstract class Vehicle {
    protected int vehicleAge;
    protected String vehicleCondition;
    protected String driverType;
    protected int mileage;
    protected String vehicleType;

    public abstract int getMileage();

    public int getVehicleAge() {
        return vehicleAge;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public String getDriverType() {
        return driverType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

}
