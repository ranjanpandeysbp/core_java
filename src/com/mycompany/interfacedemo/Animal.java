package com.mycompany.interfacedemo;

public interface Animal {
    int NO_OF_LEGS = 4;//By default member variables are public,static final
    //By default methods are public,abstract
    void speak();// common functionality so moved to interface
    }
