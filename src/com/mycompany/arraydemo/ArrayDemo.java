package com.mycompany.arraydemo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String args[]){
        int arrayofAadhar[]=new int[5];
        System.out.println(arrayofAadhar[3]);//Output is 0 because default value of int is 0
        arrayofAadhar[3]=25568;
        //Printing Aadhar Details
        for(int i=0; i<arrayofAadhar.length;i++)
        {
            System.out.println(arrayofAadhar[i]);
        }
        for(int a:arrayofAadhar){//It is an enhance for loop
            System.out.println(a);
        }
        arrayofAadhar=new int[6];
        arrayofAadhar[0]=10001;
        arrayofAadhar[1]=10002;
        arrayofAadhar[2]=10003;
        arrayofAadhar[3]=10004;
        arrayofAadhar[4]=10005;
        arrayofAadhar[5]=10006;
        int[] arrayofAadhar1 = null;
        System.out.println("-----------------");
        int found=0;
        for(int a:arrayofAadhar){//It is an enhance for loop
            System.out.println(a);
        }
        /*for(int i=0; i<arrayofAadhar.length; i++)
        {
            if(arrayofAadhar[i]==10003)
            {
                found++;
                for(int j=i;j<arrayofAadhar.length-1;j++)
                {
                    arrayofAadhar[j]=arrayofAadhar[j+1];
                }
            }
        }
        if(found==0)
        {
            System.out.println("Not found");
        }
        else
        {
            for(int a:arrayofAadhar)
            {
                System.out.println(a);
            }
        }*/
        for(int i=0; i<arrayofAadhar.length; i++)
        {
            if(arrayofAadhar[i]==10003)
            {
                found++;
                //break;
            }
        }
        if(found==0)
        {
            System.out.println("Not found");
        }
        else
        {
            arrayofAadhar1 = new int[arrayofAadhar.length - found];
            for(int i=0;i<arrayofAadhar1.length;i++)
            {
                for(int j=i;j<arrayofAadhar.length;j++)
                {
                    if(arrayofAadhar[j]!=10003)
                    {
                        arrayofAadhar1[i] = arrayofAadhar[j];
                        break;
                    }
                }
            }
        }
        System.out.println("-----------------");
        //System.out.println(arrayofAadhar[5]);
        //System.out.println(arrayofAadhar1[4]);
        for(int a: arrayofAadhar)
        {
            System.out.println(a);
        }
        System.out.println("-----------------");
        for(int a: arrayofAadhar1)
        {
            System.out.println(a);
        }
        /*
        boolean isEmployeeArray[]=new boolean[5];
        System.out.println(isEmployeeArray[3]);//Output is false because default value of boolean is false
        isEmployeeArray[3]=true;
        isEmployeeArray[8]=true;//This will throw runtime exception ArrayIndexOutOfBoundsException

        //Printing Aadhar Details
        for(int i=0; i < isEmployeeArray.length;i++)
        {
            System.out.println(isEmployeeArray[i]);
        }
         */
    }
}
