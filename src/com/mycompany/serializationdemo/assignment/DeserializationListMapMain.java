package com.mycompany.serializationdemo.assignment;

import java.io.*;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeserializationListMapMain {
    public static void main(String[] args)
    {
        String fileName = "multipleobjectlistmap.ser";
        FileInputStream file = null;
        ObjectInputStream in= null;

        try
        {
            file = new FileInputStream(fileName);
            in = new ObjectInputStream(file);
            //System.out.println(in.readObject().getClass());
            Map<String, List> mapList = (Map<String, List>) in.readObject();

            List<Car> carList = mapList.get("car");
            List<Employee> employeeList = mapList.get("employee");
            List<Student> studentList = mapList.get("student");
            List<Product> productList = mapList.get("product");

            for(int i = 0; i<carList.size(); i++)
            {
                System.out.println("Car Name: "+carList.get(i).getCarName());
            }

            for(int i = 0; i<employeeList.size(); i++)
            {
                System.out.println("Employee ID: "+employeeList.get(i).getEmpID());
            }

            for(int i = 0; i<studentList.size(); i++)
            {
                System.out.println("Student Roll No: "+studentList.get(i).getRollNo());
            }

            for(int i = 0; i<carList.size(); i++)
            {
                System.out.println("Product ID: "+ productList.get(i).getProductID());
                System.out.println("Product Name: "+productList.get(i).getProductName());
                System.out.println("Product Price: "+productList.get(i).getProductPrice());
            }

            System.out.println("Object has been deserialized");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
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
                if(null != in)
                {
                    in.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
