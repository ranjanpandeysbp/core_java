package com.mycompany.exceptiondemo;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        Float age=0F;
        try
        {
            age = sc.nextFloat();
            try
            {
                J2.validate(age);
            }
            catch (J3 j3)
            {
                System.out.println("As you are less than "+J3.MARRIAGE_AGE+" yrs, you can't marry");
            }
            catch (Exception e)
            {
                System.out.println("Something wrong occurred"+e);
            }
        }
        catch (Exception e)
        {
            System.out.println("Please provide valid age");
        }
        //System.out.println(age);
    }
}
