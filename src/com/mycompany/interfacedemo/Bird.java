package com.mycompany.interfacedemo;

public class Bird implements Animal,SuperAnimal{//Example of Multiple Inheritance

    @Override
    public void speak() {
        System.out.println("chirp");
    }
}
