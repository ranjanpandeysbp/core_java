package com.mycompany.accessmodifier2;

import com.mycompany.accessmodifier.Animal;

public class Lion extends Animal {
    public void display()
    {
        /*Animal animal = new Animal();
        System.out.println(animal.canFly);*/
        System.out.println(canFly);//protected members can be accessed outside the package in the child classes
    }

}
