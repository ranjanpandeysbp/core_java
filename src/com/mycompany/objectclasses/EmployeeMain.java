package com.mycompany.objectclasses;

public class EmployeeMain {
    public static void main(String[] args){

        Employee e1 = new Employee();
        e1.setEmployeeID(12345);
        e1.setSalary(12435.608);

        Employee e2 = new Employee();
        e2.setEmployeeID(54321);
        e2.setSalary(1622.202);

        System.out.println(e1);
        System.out.println(e2);
        //System.out.println("Employee ID is "+e1.getEmployeeID()+" and salary is "+e1.getSalary());
        //System.out.println("Employee ID is "+e2.getEmployeeID()+" and salary is "+e2.getSalary());
    }
}
