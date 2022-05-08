package com.mycompany.serializationdemo.assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationMain {
    public static void main(String[] args)
    {
        Car car1 = new Car("Honda City");
        Car car2 = new Car("Hyundai Verna");

        Employee employee1 = new Employee(123456L);
        Employee employee2 = new Employee(789101112L);

        Student student1 = new Student(1);
        Student student2 = new Student(2);

        Product product1 = new Product(100,"Parle G",10.5);
        Product product2 = new Product(200,"Tiger",12.5);

        List objectList = new ArrayList();
        String fileName = "multipleobject.ser";

        objectList.add(car1);
        objectList.add(car2);
        objectList.add(employee1);
        objectList.add(employee2);
        objectList.add(student1);
        objectList.add(student2);
        objectList.add(product1);
        objectList.add(product2);

        System.out.println("Size of ArrayList created is: "+objectList.size());

        try
        {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(objectList);


            System.out.println("Object has been serialized");
        }
        catch (IOException e) {
            System.out.println("IO Exception is caught");
            e.printStackTrace();
        }
        finally
        {

        }
    }
}
