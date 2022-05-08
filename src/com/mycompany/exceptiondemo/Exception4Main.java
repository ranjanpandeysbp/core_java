package com.mycompany.exceptiondemo;

public class Exception4Main {

    public static void main(String[] args)
    {
        //int a = 5;
        //int b = 0;
        calculate(5,2);
        calculate(5,0);
    }
    public static int calculate(int a, int b)
    {
        int c = 0;
        //System.exit(0);
        try{
            c = a/b;
            System.out.println(c);
            //System.exit(0);
        }
        finally {
            System.out.println("inside finally");
        }
        //System.exit(0);
        System.out.println("Exiting calculate function");
        return c;
    }
}
