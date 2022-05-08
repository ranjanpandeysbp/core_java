package com.mycompany.exceptiondemo;

public class Exception2Main {
    public static void main(String[] args)
    {
        String s1 = "Hi I am a valid String";
        String s2=null;
        displayLength(s1);
        displayLength(s2);
    }
    public static void displayLength(String s)
    {
        try {
            System.out.println(s.length());
        }
        catch (Exception e)
        {
            System.out.println("Null Pointer Exception");
        }
    }
}
