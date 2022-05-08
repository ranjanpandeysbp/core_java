/*14.Write a program to find second largest number in an array?*/
package com.mycompany.day17handson.q14;

public class C14_2 {
    public static void main(String[] args)
    {
        //int[] arr = new int[]{1,2,3,4,5,6};
        //int[] arr = new int[]{6,5,4,3,2,1};
        //int[] arr = new int[]{1,2,3,4,3,2,1,0};
        int[] arr = new int[]{1,2,3,4,3,2,1,0,4,4,3,4,3,4};
        //int[] arr = new int[]{};
        //int[] arr = new int[]{1};
        //int[] arr = new int[]{1,2,1,0,9,8,5,6,7,8};
        System.out.println("Displaying the elements of array");
        for(int a: arr)
        {
            System.out.println(a);
        }
        int temp = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = arr.length-1;i>0;i--)//This code handles duplicate values
        {
            if(arr[i]>arr[i-1])
            {
                temp = arr[i-1];
                break;
            }
        }
        System.out.println("Displaying the elements of array");
        for(int a: arr)
        {
            System.out.println(a);
        }
        try
        {
            System.out.println("Second largest number in the array is: " + arr[arr.length - 2]);//This does not work if the largest number is present more than once
            System.out.println("Second largest number in the array is: " + temp);
        }
        catch (Exception e)
        {
            if(arr.length==0)
            {
                System.out.println("Array has no element, hence can not find second largest element");
            }
            else if(arr.length==1)
            {
                System.out.println("Array has only one element, hence can not find second largest element");
            }
        }
    }
}
