package com.mycompany.inheritancedemo;

public class Bike extends Vehicle{//Bike is the sub class
    public Bike()
    {
        //super(); similar to calling Vehicle(); If we don't call JVM automatically calls it
        //If we dont write super(), JVM automatically calls the constructor of parent class.
        //new Vehicle();
        super("hdshdfs");
        System.out.println("Default Constructor of Child class Bike");
        super.setVehicleType("Bike is Two Wheeler");
    }

    public void display()
    {

        System.out.println(super.getVehicleType());
        System.out.println(super.regNo);
    }
    //Method Overriding(modifying the definition of the show() inherited from parent class)
    public void show()
    {
        System.out.println("I am child class Bike");
    }
}
