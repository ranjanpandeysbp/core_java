package com.mycompany.accessmodifier;

public class Bird {
    public void display()
    {
        Animal animal = new Animal();
        //System.out.println(animal.animalName);//private variable animalName can be accessed only the same class
        System.out.println(animal.getAnimalName());
        //public members can be accessed within the same class and outside the class in same package, outside the class in different package
        System.out.println(animal.animalType);//default member variables and functions can be accessed within the same class and outside the class but in same package
        System.out.println(animal.canFly);//protected variable,methods can be accessed within the same class but also within the same package
        //System.out.println(canFly);
        //System.out.println(getAnimalName ());
    }
}
