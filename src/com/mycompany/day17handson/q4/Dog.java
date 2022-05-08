package com.mycompany.day17handson.q4;

public class Dog extends Animal{
    @Override
    protected void speak() {//Overridden method in child class
        System.out.println("Dogs bark");
    }
}
