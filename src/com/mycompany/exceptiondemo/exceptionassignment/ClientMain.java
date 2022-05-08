package com.mycompany.exceptiondemo.exceptionassignment;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to validate whether eligible to vote or marry");
        int age = sc.nextInt();
        sc.nextLine();
        BusinessLayer bl = new BusinessLayer();
        try {
            System.out.println(bl.validateVotingAge(age));
        } catch (BusinessException e) {
            System.out.println("Error Code: "+e.getErrorCode());
            System.out.println("Error Message: "+e.getErrorMessage());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try {
            System.out.println(bl.validateMarriageableAge(age));
        } catch (BusinessException e) {
            System.out.println("Error Code: "+e.getErrorCode());
            System.out.println("Error Message: "+e.getErrorMessage());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
