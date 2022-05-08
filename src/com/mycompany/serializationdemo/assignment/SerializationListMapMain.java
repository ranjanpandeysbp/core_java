package com.mycompany.serializationdemo.assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerializationListMapMain {
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

        List<Car> carList = new ArrayList<Car>();
        List<Employee> employeeList = new ArrayList<Employee>();
        List<Student> studentList = new ArrayList<Student>();
        List<Product> productList = new ArrayList<Product>();
        Map<String,List> mapList= new HashMap();

        carList.add(car1);
        carList.add(car2);
        employeeList.add(employee1);
        employeeList.add(employee2);
        studentList.add(student1);
        studentList.add(student2);
        productList.add(product1);
        productList.add(product2);
        mapList.put("car",carList);
        mapList.put("employee",employeeList);
        mapList.put("student",studentList);
        mapList.put("product",productList);

        String fileName = "multipleobjectlistmap.ser";
        FileOutputStream file = null;
        ObjectOutputStream out= null;
        try
        {
            file = new FileOutputStream(fileName);
            out = new ObjectOutputStream(file);

            out.writeObject(mapList);
            System.out.println("Object has been serialized");
        }
        catch (IOException e) {
            System.out.println("IO Exception is caught");
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(null != file)
                {
                file.close();
                }
                if(null != out)
                {
                    out.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
