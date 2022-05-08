package com.mycompany.roughwork;

import java.util.Scanner;

public class ArrayElementDeletion {
    public static void main(String[] args) {
        int[] arrayOfAadhaar={1, 2, 5, 12, 7, 3, 8};
        int[] tempArrayOfAadhaar = null;
        Scanner sc = new Scanner(System.in);
        /*arrayOfAadhaar = new int[6];
        arrayOfAadhaar[0]=10001;
        arrayOfAadhaar[1]=10002;
        arrayOfAadhaar[2]=10003;
        arrayOfAadhaar[3]=10004;
        arrayOfAadhaar[4]=10005;
        arrayOfAadhaar[5]=10006;*/
        System.out.println("-----------------------------------");
        for(int a: arrayOfAadhaar)
        {
            System.out.println(a);
        }
        System.out.println("-----------------------------------");
        System.out.println("Enter the item to be deleted");
        int item = sc.nextInt();
        sc.nextLine();
        int flag=0;
        for(int i = 0; i< arrayOfAadhaar.length;i++)
        {
            //System.out.println("i :"+i);
            if(arrayOfAadhaar[i]==item)
            {
                flag++;
                for(int j=i;j< arrayOfAadhaar.length-1;j++)
                {
                    //System.out.println("Inside for");
                    arrayOfAadhaar[j]=arrayOfAadhaar[j+1];
                }
                break;
            }
            //System.out.println("Outside for");
        }
        System.out.println("-----------------------------------");
        for(int a: arrayOfAadhaar)
        {
            System.out.println(a);
        }
        System.out.println("-----------------------------------");
        if(flag==0)
        {
            System.out.println(item+" was not found");
        }
        else
        {
            tempArrayOfAadhaar = new int[arrayOfAadhaar.length-1];
            for(int i=0; i< tempArrayOfAadhaar.length;i++)//doubt, iterate over tempArrayOfAadhaar or Aadhaar
            //for(int i=0; i< arrayOfAadhaar.length-1;i++)//doubt, iterate over tempArrayOfAadhaar or Aadhaar
            {
                tempArrayOfAadhaar[i] = arrayOfAadhaar[i];
            }
            arrayOfAadhaar = tempArrayOfAadhaar;
            System.out.println("New way");
            System.out.println("-----------------------------------");
            for(int a: arrayOfAadhaar)
            {
                System.out.println(a);
            }
            System.out.println("-----------------------------------");
            /*System.out.println("-----------------------------------");
            for(int a: tempArrayOfAadhaar)
            {
                System.out.println(a);
            }
            System.out.println("-----------------------------------");
            arrayOfAadhaar = new int[arrayOfAadhaar.length-1];//doubt, whose length should be taken
            */System.out.println("Length of original array is now:"+arrayOfAadhaar.length);
            //System.out.println("Length of copied array is now:"+tempArrayOfAadhaar.length);

            for(int i=0; i< tempArrayOfAadhaar.length-1;i++)//doubt, iterate over tempArrayOfAadhaar or Aadhaar
            {
                arrayOfAadhaar[i] = tempArrayOfAadhaar[i];
            }
            /*
            System.out.println("-----------------------------------");
            for(int a: tempArrayOfAadhaar)
            {
                System.out.println(a);
            }
            System.out.println("-----------------------------------");
            */
            System.out.println(item+" was found and deleted");
            System.out.println("-----------------------------------");
            for(int a: arrayOfAadhaar)
            {
                System.out.println(a);
            }
            System.out.println("-----------------------------------");

        }
        System.out.println("-----------------------------------");
        for(int a: arrayOfAadhaar)
        {
            System.out.println(a);
        }
        System.out.println("-----------------------------------");
    }
}