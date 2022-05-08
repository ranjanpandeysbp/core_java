/*2.Write a Program to showcase inheritance?*/
package com.mycompany.day17handson.q2;

public class VehicleMain {
    public static void main(String[] args)
    {
        Bike bike = new Bike();
        bike.setRegNo(123456);//Superclass setter method
        bike.setNoOfGears(5);
        System.out.println(bike.getRegNo());//Superclass getter method
        System.out.println(bike.getNoOfGears());
    }
}
