package com.mycompany.day17handson.q4;

public class Animal {
    private String soundType;
    protected void speak()
    {
        System.out.println("Different animals produce different sounds");
    }
    protected void speak(String soundType)
    {//Overloaded method speak based on number of parameters
        this.soundType = soundType;
        System.out.println("Test sound produced by animal "+soundType);
    }
}
