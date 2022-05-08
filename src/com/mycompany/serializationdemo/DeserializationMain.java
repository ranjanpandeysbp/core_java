package com.mycompany.serializationdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationMain {
    public static void main (String[] args)
    {
        String fileName = "file.ser";
        Product object1 = null;

        try
        {
            //Reading the object from a file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            //Method for deserialization of object
            object1 = (Product) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");

            System.out.println("Product ID = "+object1.getProductID());
            System.out.println("Product Name = "+object1.getProductName());
            System.out.println("Product Price = "+object1.getProductPrice());
        }
        catch (IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
