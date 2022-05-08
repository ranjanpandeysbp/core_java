/*15.Write a program to check if two arrays contains same elements?*/
package com.mycompany.day17handson.q15;

import java.util.Arrays;

public class C15 {
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{3,5,1,0,7,8,6,7};
        //int[] arr2 = new int[]{3,5,1,0,7,8,6,7};
        //int[] arr2 = new int[]{7,6,8,7,0,1,5,3};
        int[] arr2 = new int[]{3,4,7,8,9,10,7,8};
        int[] sArr1 = null;
        int[] sArr2 = null;
        if(arr1.length==arr2.length)
        {
            sArr1 = sortArray(arr1);
            sArr2 = sortArray(arr2);
            System.out.println("Array 1 is: "+ Arrays.toString(arr1));//doubt, why is this changed
            System.out.println("Sorted Array 1 is: "+ Arrays.toString(sArr1));
            System.out.println("Array 2 is: "+ Arrays.toString(arr2));//doubt, why is this changed
            System.out.println("Sorted Array 2 is: "+ Arrays.toString(sArr2));
            for (int a: sArr1)
            {
                System.out.println(a);
            }
            for (int a: sArr2)
            {
                System.out.println(a);
            }
            int flag = 0;
            for(int i =0; i< sArr1.length; i++)
            {
                if(sArr1[i]!=sArr2[i])
                {
                    flag++;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("Both the array contains same elements");
            }
            else
            {
                System.out.println("Arrays contains different elements");
            }
        }
        else
        {
            System.out.println("Array 1 and Array 2 have different lengths");
        }

    }
    public static int[] sortArray(int[] a)
    {
        for (int i = 0; i<a.length; i++)
        {
            for (int j = i+1; j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
