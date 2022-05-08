package com.mycompany.interfacedemo;

public class AnimalMain {
    public static void main(String[] args)
    {
        //Animal animal = new Animal();//'Animal' is abstract; cannot be instantiated
        Bird bird = new Bird();
        bird.speak();
        Tiger tiger = new Tiger();
        tiger.speak();
        Animal a1 = new Bird();//Loose Coupling: We are not tightly coupled to create reference of same object, can be Bird or can be Tiger
        a1.speak();
        Animal a2 =  new Tiger();//Loose Coupling
        a2.speak();
    }
}
