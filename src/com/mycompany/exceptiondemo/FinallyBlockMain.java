package com.mycompany.exceptiondemo;

public class FinallyBlockMain {
    public static void main(String[] args)
    {
        try
        {
            int data = 25/5;
            System.out.println(data);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block is always executed whether exception occurred or not");
            System.out.println("Database connection closing, or File operation closing or any cleaning activity can be done in finally block");
        }
        System.out.println("rest of the code...");

        try{

        }
        finally
        {
            System.out.println("try with finally can exist");
        }
        try
        {
            System.exit(0);
        }
        finally {
            System.out.println("Finally block will not be executed as System.exit() was called");
        }
    }
}
