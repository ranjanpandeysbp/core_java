package com.mycompany.objectclasses;

import java.util.Scanner;

public class EmployeeMainNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int size=scanner.nextInt();
        System.out.println("Number of employees entered is "+size);
        Employee emp[]=new Employee[size];
        //System.out.println("Size of Employee Array is "+emp.length);
        System.out.println("Please provide the Employee ID and Salary of the employees:");
        //emp[0]=new Employee();
        System.out.println("Emp Array:"+emp);
        System.out.println("Emp Array:"+emp[0]);
        //System.out.println("Emp Array:"+emp[1]);
        //emp[0].setEmployeeID(132);
        //System.out.println(emp[0].getEmployeeID());
        //for(int i=0; i<size;i++)
        for(int i=0; i<emp.length;i++)
        {
            emp[i]=new Employee();//Why do we need this-- Null Pointer Exception is coming if it is not used
            //creates an employee Object and assigns the object reference
            System.out.println("Employee ID of the employee "+(i+1)+":");
            long empId=scanner.nextLong();
            //System.out.println("empId value is "+empId);
            emp[i].setEmployeeID(empId);
            System.out.println("Salary of the employee "+(i+1)+":");
            emp[i].setSalary(scanner.nextDouble());
        }
        System.out.println("Displaying the details of the Employee ID and Salary of the employees provided:");
        for(int i=0; i<size; i++)
        {
            System.out.println("Employee ID of the employee "+(i+1)+" is "+emp[i].getEmployeeID());
            System.out.println("Salary of the employee "+(i+1)+" is "+emp[i].getSalary());
        }
    }
}
