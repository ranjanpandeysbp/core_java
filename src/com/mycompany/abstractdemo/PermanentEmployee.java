package com.mycompany.abstractdemo;

//This class must be declared as abstract or provide method body to all the abstract methods in the abstract class
public class PermanentEmployee extends Employee{

    @Override
    public double calculateSalary(String employmentType) {
        double tax = 0.2;
        double grossSalary = 60000;
        double netSalary = 0.0;
        if(employmentType.equalsIgnoreCase("Permanent"))
        {
            netSalary = grossSalary - (grossSalary*tax);
            netSalary = netSalary + 10000;//10000 is the bonus for permanent employee
        }
        return netSalary;
    }
}
