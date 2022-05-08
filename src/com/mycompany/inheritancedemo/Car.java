package com.mycompany.inheritancedemo;

public class Car extends Vehicle{//Car is the sub class
    public long buildNumber;
    public Car()
    {
        //super();
        System.out.println("Default Constructor of Child Class Car");
        super.setVehicleType("Car is Four Wheeler");
        //System.out.println(super.getVehicleType());//Alternative of showDetails method
        //super();//call to 'super()'  must be first statement in constructor body
    }
    public Car(long buildNumber)
    {
        //super("buildNumber");//Child always calls the default constructor of the parent
        this();//call to the default constructor of Car class which is line 5
        this.buildNumber = buildNumber;
        //this();//call to 'this()'  must be first statement in constructor body
    }
    public Car(String a, long xyz){
        this(7L);// call to line 13 (one parameterized constructor
    }
    public void showDetails()
    {
        //System.out.println(super.getVehicleType());
        System.out.println(getVehicleType());//Same as super.getVehicleType()
        System.out.println("Build Number of car is "+this.buildNumber);
    }
    //Method overriding
    public void show()//The child class Car is overriding the logic of the parent class function show()
    {
        System.out.println("I am child class Car");
    }
}
