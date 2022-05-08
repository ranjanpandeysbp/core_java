package com.mycompany.serializationdemo.assignment.usinglist;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialize {
    public static void main(String[] args) {
        Employee emp = new Employee("Krishna",27,25000);
        Employee emp1 = new Employee("Pabitra",28,52000);
        Employee emp2 = new Employee("Ranjan",30,600000);
        Employee emp3 = new Employee("Naresh",26,300000);
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        String filename = "emp.txt";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(empList);
            out.close();
            file.close();
            System.out.println("Employee has been serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
