package com.mycompany.abstractdemo;

public class ContractEmployee extends Employee {

    @Override
    public double calculateSalary(String employmentType) {
        double tax = 0.3;
        double grossSalary = 80000;
        double netSalary = 0.00;
        if(employmentType.equalsIgnoreCase("Contractual"))
        {
            netSalary = grossSalary - (grossSalary*tax);
            netSalary = netSalary - 5000;//5000 is the deduction for contractual employee
        }
        return netSalary;
    }
}
