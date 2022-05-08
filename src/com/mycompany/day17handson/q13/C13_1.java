 /*13.Write a program to Shuffle a given integer array in Java?*/
package com.mycompany.day17handson.q13;

import java.util.Random;

public class C13_1 {
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println("Before shuffling Array is");
        for(int a: arr)
        {
            System.out.println(a);
        }
        Random random = new Random();

        for(int i = arr.length-1;i>=0;i--)//if we use i>=0 that is of no use, at i=0 a j = random.nextInt(1) i.e. j=0
        //for(int i = 0; i < arr.length; i++)
        {
            //int j = random.nextInt(i+1);//Which one is better?
            int j = random.nextInt(arr.length);
            System.out.println("i:"+i+", j:"+j);
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("After shuffling Array is");
        for(int a: arr)
        {
            System.out.println(a);
        }
    }
}
