package com.mycompany.objectclasses;

public class Employee {
    long employeeID;
    double salary;

    void setEmployeeID(long eid)
    {
        employeeID=eid;
    }
    void setSalary(double s)
    {
        salary=s;
    }

    long getEmployeeID()
    {
        return employeeID;
    }
    double getSalary()
    {
        return salary;
    }

    //Example to show how to Override the toString() method
    @Override
    public String toString()
    {
        String s = employeeID + " " + salary;
        return s;
    }
}
