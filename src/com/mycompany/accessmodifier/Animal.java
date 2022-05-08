package com.mycompany.accessmodifier;

public class Animal {

    private String animalName = "Fox";
    /*default*/ String animalType;
    protected boolean canFly;
    public String getAnimalName()
    {
        System.out.println(this.animalName);//private variable and methods can be accessed within the same class
        System.out.println(this.canFly);//protected variable and methods can be accessed within the same class
        System.out.println(this.animalType);//default variable and methods can be accessed within the same class
        return this.animalName;//private members can be accessed within the same class
    }
}
