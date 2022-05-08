package com.mycompany.serializationdemo.assignment.usinglist;

import java.io.Serializable;

public class Employee implements Serializable {
    private String empName;
    private int empAge;
    private double empSal;

    public Employee(String empName, int empAge, double empSal) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSal = empSal;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSal() {
        return empSal;
    }
}