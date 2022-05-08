/*14.Write a program to find second largest number in an array?*/
package com.mycompany.day17handson.q14;

public class C14_1 {
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
        for(int a : arr)
        {
            System.out.println(a);
        }
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i< arr.length;i++)
        {
            if(max1<arr[i])
            {
                max1 = arr[i];
            }
            if(max2<arr[i] && arr[i]<max1)
            {
                max2 = arr[i];
            }
        }
        /*for(int i=0;i< arr.length;i++)
        {
            if(max2<arr[i] && arr[i]<max1)
            {
                max2 = arr[i];
            }
        }*/
        System.out.println("Largest value is: "+max1);
        System.out.println("Second Largest value is: "+max2);
    }
}
