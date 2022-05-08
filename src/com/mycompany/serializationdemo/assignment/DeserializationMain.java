package com.mycompany.serializationdemo.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationMain {
    public static void main(String[] args)
    {
        Car car = null;
        Employee employee = null;
        Student student = null;
        Product product = null;

        String fileName = "multipleobject.ser";

        FileInputStream file = null;
        ObjectInputStream in =null;

        try
        {
            file = new FileInputStream(fileName);
            in = new ObjectInputStream(file);
            List objectList = (ArrayList) in.readObject();

            for(int i=0; i< objectList.size(); i++){
                System.out.println(objectList.get(i).getClass());
            }

            in.close();
            file.close();

            System.out.println("Object has been deserialized");

            /*
            for(int i = 0; i < objectList.size(); i++)
            {
                if(objectList.get(i) instanceof Car)
                {
                    objectList.set(i,(Car)objectList.get(i));
                }
                else if(objectList.get(i) instanceof Employee)
                {
                    objectList.set(i,(Employee)objectList.get(i));
                }
                else if(objectList.get(i) instanceof Student)
                {
                    objectList.set(i,(Student)objectList.get(i));
                }
                else if(objectList.get(i) instanceof Product)
                {
                    objectList.set(i,(Product)objectList.get(i));
                }
            }

            System.out.println(objectList.size());
            */

            for(int i = 0; i < objectList.size(); i++)
            {
                if(objectList.get(i) instanceof Car)
                {
                    car = (Car) objectList.get(i);
                    System.out.println("Car Name: "+car.getCarName());
                }
                else if(objectList.get(i) instanceof Employee)
                {
                    employee = (Employee) objectList.get(i);
                    System.out.println("Employee ID: "+employee.getEmpID());
                }
                else if(objectList.get(i) instanceof Student)
                {
                    student = (Student) objectList.get(i);
                    System.out.println("Student Roll No: "+student.getRollNo());
                }
                else if(objectList.get(i) instanceof Product)
                {
                    product = (Product) objectList.get(i);
                    System.out.println("Product ID: "+product.getProductID());
                    System.out.println("Product Name: "+product.getProductName());
                    System.out.println("Product Price: "+product.getProductPrice());
                }
            }


            /*//Why is it still asking to typecast even after using the set method by typecasting above
            car1 = (Car) objectList.get(0);
            car2 = (Car) objectList.get(1);
            employee1 = (Employee) objectList.get(2);
            employee2 = (Employee) objectList.get(3);
            student1 = (Student) objectList.get(4);
            student2 = (Student) objectList.get(5);
            product1 = (Product) objectList.get(6);
            product2 = (Product) objectList.get(7);

            System.out.println("Object has been deserialized");
            System.out.println("Car 1 Name: "+car1.getCarName());
            System.out.println("Car 2 Name: "+car2.getCarName());
            System.out.println("Employee 1 ID: "+employee1.getEmpID());
            System.out.println("Employee 2 ID: "+employee1.getEmpID());
            System.out.println("Student 1 Roll No: "+student1.getRollNo());
            System.out.println("Student 2 Roll No: "+student1.getRollNo());
            System.out.println("Product 1 ID: "+product1.getProductID());
            System.out.println("Product 1 Name: "+product1.getProductName());
            System.out.println("Product 1 Price: "+product1.getProductPrice());
            System.out.println("Product 2 ID: "+product2.getProductID());
            System.out.println("Product 2 Name: "+product2.getProductName());
            System.out.println("Product 2 Price: "+product2.getProductPrice());
            */
        }
        catch(IOException e) {
            System.out.println("IOException is caught");
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
            e.printStackTrace();
        }

    }
}
