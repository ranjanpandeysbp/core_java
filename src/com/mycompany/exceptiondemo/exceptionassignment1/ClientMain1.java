package com.mycompany.exceptiondemo.exceptionassignment1;

import java.util.Scanner;

public class ClientMain1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to validate whether eligible to vote or marry");
        int age = sc.nextInt();
        sc.nextLine();
        UILayer1 uil = new UILayer1();
        try {
            String result = uil.validateMarriageAge(age);
            System.out.println(result);
        } catch (BusinessException1 e) {
            System.out.println("Error Code: "+e.getErrorCode());
            System.out.println("Error Message: "+e.getErrorMessage());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        try {
            String result = uil.validateVotingAge(age);
            System.out.println(result);
        } catch (BusinessException1 e) {
            System.out.println("Error Code: "+e.getErrorCode());
            System.out.println("Error Message: "+e.getErrorMessage());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
