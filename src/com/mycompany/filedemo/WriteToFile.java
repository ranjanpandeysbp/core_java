package com.mycompany.filedemo;

////Import the FileWriter class
import java.io.FileWriter;

//Import the IOException Class to handle errors
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args)
    {
        try
        {
            //FileWriter myWriter = new FileWriter("D:/FileHandling/NewFilef1.txt");
            FileWriter myWriter = new FileWriter("Demo.txt");
            //Writes this content into the specified file
            myWriter.write("Java is the prominent programming language of the millennium!");

            //Closing is necessary to retrieve the resources allocated
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
