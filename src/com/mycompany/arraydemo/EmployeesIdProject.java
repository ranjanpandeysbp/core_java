package com.mycompany.arraydemo;

import java.util.Scanner;

public class EmployeesIdProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter your age");
        int age= scanner.nextInt();
        System.out.println(age);*/
        System.out.println("Hi, Please enter the number of employees in your Company");
        int numberOfEmployees=scanner.nextInt();//Getting the number of Employees from the User. The User Interger Input was taken from Keyboard and assigned to the varaible.
        int arrayOfEmployees[] = new int[numberOfEmployees];

        //Logic to take inout from Keyboard and store it in Array
        for(int i=0;i<arrayOfEmployees.length;i++)
        {
            System.out.println("Enter the EmployeeId of "+(i+1)+" employee");
            arrayOfEmployees[i]= scanner.nextInt();
        }
        //Printing all employee Ids
        for(int i=0; i<arrayOfEmployees.length;i++)
        {
            System.out.println("Employee ID of Employee "+(i+1)+" is "+arrayOfEmployees[i]);
        }

    }
}
