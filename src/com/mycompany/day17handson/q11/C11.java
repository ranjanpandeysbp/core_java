/*11.Write a Program to show try catch example?*/
package com.mycompany.day17handson.q11;

public class C11 {
    public static void divide(int a, int b)
    {
        try
        {
            int c = a/b;
            System.out.println("a/b is: "+c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error occurred: "+e);
        }
        catch (Exception e)
        {
            System.out.println("Error occurred: "+e);
        }
    }
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;
        divide(a,b);
        System.out.println("Rest of the program");
    }
}