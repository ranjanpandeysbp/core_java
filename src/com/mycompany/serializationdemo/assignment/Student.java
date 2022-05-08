package com.mycompany.serializationdemo.assignment;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer rollNo;

    public Student(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }
}
