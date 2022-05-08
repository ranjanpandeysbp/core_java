package com.mycompany.serializationdemo.assignment;

import java.io.Serializable;

public class Employee implements Serializable {
    private Long empID;

    public Employee(Long empID) {
        this.empID = empID;
    }

    public Long getEmpID() {
        return empID;
    }
}
