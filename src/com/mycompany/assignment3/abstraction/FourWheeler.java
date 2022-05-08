package com.mycompany.assignment3.abstraction;

public class FourWheeler extends Vehicle{
    private final int BASE_MILEAGE;
    private final int REDUCTION_FACTOR;

    public FourWheeler() {
        this.BASE_MILEAGE = 30;
        this.REDUCTION_FACTOR = 4;
    }

    public FourWheeler(String vehicleType, int vehicleAge, String vehicleCondition, String driverType) {
        this();
        this.vehicleType = vehicleType;
        this.vehicleAge = vehicleAge;
        this.vehicleCondition = vehicleCondition;
        this.driverType = driverType;
    }

    @Override
    public int getMileage() {
        if(vehicleType.equalsIgnoreCase("Four Wheeler"))
        {
            if((vehicleAge<=15)&&(vehicleCondition.equalsIgnoreCase("good"))&&(driverType.equalsIgnoreCase("experienced")))
            {
                mileage = BASE_MILEAGE;
            }
            else if ((vehicleAge<=15)&&(vehicleCondition.equalsIgnoreCase("good"))&&(driverType.equalsIgnoreCase("not experienced")))
            {
                mileage = BASE_MILEAGE - REDUCTION_FACTOR;
            }
            else if ((vehicleAge<=15)&&(vehicleCondition.equalsIgnoreCase("bad"))&&(driverType.equalsIgnoreCase("experienced")))
            {
                mileage = BASE_MILEAGE -2* REDUCTION_FACTOR;
            }
            else if ((vehicleAge>15)&&(vehicleCondition.equalsIgnoreCase("good"))&&(driverType.equalsIgnoreCase("experienced")))
            {
                mileage = BASE_MILEAGE -3* REDUCTION_FACTOR;
            }
            else if ((vehicleAge<=15)&&(vehicleCondition.equalsIgnoreCase("bad"))&&(driverType.equalsIgnoreCase("not experienced")))
            {
                mileage = BASE_MILEAGE -4* REDUCTION_FACTOR;
            }
            else if ((vehicleAge>15)&&(vehicleCondition.equalsIgnoreCase("bad"))&&(driverType.equalsIgnoreCase("experienced")))
            {
                mileage = BASE_MILEAGE -5* REDUCTION_FACTOR;
            }
            else
            {
                mileage = BASE_MILEAGE -6* REDUCTION_FACTOR;
            }
        }
        return mileage;
    }
    public void display()
    {
        System.out.println("Vehicle Type is "+getVehicleType());
        System.out.println("Vehicle Age is "+getVehicleAge()+" years");
        System.out.println("Vehicle Condition is "+getVehicleCondition());
        System.out.println("Driver Type is "+getDriverType());
        System.out.println("Mileage is "+getMileage()+" km/l");
    }
}
