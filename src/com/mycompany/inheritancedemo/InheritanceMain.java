package com.mycompany.inheritancedemo;

public class InheritanceMain {
    public static void main(String[] args)
    {
        Bike bike = new Bike();
        bike.display();
        Car car = new Car(890655);
        car.showDetails();

        System.out.println("-------------------------------------");
        //The concept of making decision to which object's method should be called at run time
        //is called dynamic polymorphism
        //Thumbrule: Whose object that particular class method gets called// doesn't matter whose reference it is
        Vehicle vehicle = new Vehicle();
        vehicle.show();

        vehicle = new Bike();//vehicle reference is pointing to bike object, According to Thumbrule mentioned above
        //Bike Class show() is called.
        vehicle.show();

        vehicle = new Car();
        vehicle.show();
    }
}
