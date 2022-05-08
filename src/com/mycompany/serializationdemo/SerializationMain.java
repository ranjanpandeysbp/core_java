package com.mycompany.serializationdemo;

import java.io.*;

public class SerializationMain {
    public static void main(String[] args)
    {
        Product object = new Product(1,"Rubber",20.0);
        //Product object2 = new Product(2,"Phone",2000.0);
        String fileName = "file.ser";

        //Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //Method for serialization of object
            out.writeObject(object);
            //out.writeObject(object2);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        }
        catch (IOException e)
        {
            System.out.println("IO Exception is caught");
        }
    }
}
