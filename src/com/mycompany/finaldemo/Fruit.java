package com.mycompany.finaldemo;

public /*final*/ class Fruit {//final type class cannot be inherited
    String fruitColour;
    public final void displayName()//final method cannot be overridden
    {
        System.out.println("Fruit Parent Class");
    }
}
