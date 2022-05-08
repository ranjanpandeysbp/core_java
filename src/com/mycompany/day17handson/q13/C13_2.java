/*13.Write a program to Shuffle a given integer array in Java?*/
package com.mycompany.day17handson.q13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C13_2 {
    private static void shuffleArray(int[] arr)
    {
        Random random = new Random();
        for(int i = 0; i< arr.length; i++)
        {
            //int j = random.nextInt(i+1);
            int j = random.nextInt(arr.length);
            System.out.println("i:"+i+", j:"+j);
            swapElements(arr,i,j);
        }
    }
    private static int[] swapElements(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        sc.nextLine();
        int [] arr = new int[size];
        System.out.println("Enter "+size+" integer array elements");
        for(int i = 0; i< arr.length; i++)
        {
            System.out.println("Enter the element "+(i+1));
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        /*System.out.println("Original Array is");
        for(int a: arr)
        {
            System.out.println(a);
        }
        */
        System.out.println("Original array: "+ Arrays.toString(arr));
        shuffleArray(arr);

        /*System.out.println("Shuffled Array is");
        for(int a: arr)
        {
            System.out.println(a);
        }
        */
        System.out.println("Shuffled array: "+Arrays.toString(arr));
    }
}
