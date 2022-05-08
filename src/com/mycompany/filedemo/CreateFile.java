package com.mycompany.filedemo;

//Import the File class
import java.io.File;

//Import the IOException Class to handle errors
import java.io.IOException;
import java.util.Arrays;

public class CreateFile {
    public static void main(String[] args)
    {
        try
        {
            //Creating an object of a file
            File myObj = new File("Demo.txt");
            //File myObj = new File("D:\\Shiva_Sahasranama_Stotram-Rathnakumar[www.Mp3MaD.Com].mp3");
            //File myObj = new File("D:/Study Materials/NewFilef1.txt");
            //File myObj = new File("D:\\");
            /*
            System.out.println(myObj.canRead());
            System.out.println(myObj.canWrite());
            System.out.println(myObj.exists());
            System.out.println(myObj.length());
            System.out.println(Arrays.toString(myObj.list()));//works with path, not with File
            */
            if(myObj.createNewFile())
            {
                System.out.println("File created: "+myObj.getName());
                System.out.println("File path: "+myObj.getPath());
                System.out.println("File path: "+myObj.getAbsolutePath());
                System.out.println("File path: "+myObj.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exists.");
                System.out.println("File path: "+myObj.getPath());
                System.out.println("File path: "+myObj.getAbsolutePath());
                System.out.println("File path: "+myObj.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
