package com.mycompany.serializationdemo.assignment.usinglist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialize {
    public static void main(String[] args){
        Employee emp = null;
        String filename = "emp.txt";
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            //System.out.println(in.readObject().getClass());
            ArrayList<Employee> empArr = (ArrayList<Employee>) in.readObject();
            System.out.println(empArr.getClass());
            System.out.println("Object has been deserialized");
            /* for(Object a: empArr ){
                //emp = (Employee) a;
                //System.out.println(emp.getEmp_name());
            }*/
            for(int i=0;i<empArr.size();i++){
                emp = empArr.get(i);
                System.out.println(emp.getEmpName()+" "+emp.getEmpAge()+" "+emp.getEmpSal());
            }
            in.close();
            file.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }
}
