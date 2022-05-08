package com.mycompany.exceptiondemo;

import java.io.IOException;

public class CustomExceptionMain {
    static void validate(int age) throws InvalidAgeException, IOException {//or throws Exception
        if(age<18)
            {
                InvalidAgeException ia = new InvalidAgeException("not valid");
                throw ia;
            }
        else
        {
            System.out.println("Welcome to vote");
        }
        throw new IOException();
    }
    public static void main(String[] args) {
        try
        {
            //Program will skip the line after 22 because InvalidAgeException gets thrown inside validate()
            //It looks for the matching catch block otherwise looks for the general exception block and the program flow continues
            //validate(14);
            validate(14);
            System.out.println("not reachable");
        }
        catch(InvalidAgeException m)
        {
            System.out.println("you are not allowed to vote because you are less than 18 years of age "+m);
        }
        catch(IOException i)
        {
            System.out.println("IO Exception "+i);//Why this or parent Exception  is not shown even when we have multiple throw
        }
        catch (Exception m)//Parent exception catch block should be always at the last otherwise compilation error
        {
            System.out.println("Exception occured: "+m);
        }
        System.out.println("rest of the code");
    }
}
