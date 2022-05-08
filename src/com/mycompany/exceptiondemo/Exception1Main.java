package com.mycompany.exceptiondemo;

public class Exception1Main {

    public static void main(String[] args)
    {
        //int a = 5;
        //int b = 0;
        calculate(5,2);
        calculate(5,0);
    }
    public static void calculate(int a, int b)
    {
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println("Exiting calculate function");
    }
}
