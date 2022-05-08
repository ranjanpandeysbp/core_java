package com.mycompany.exceptiondemo;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
