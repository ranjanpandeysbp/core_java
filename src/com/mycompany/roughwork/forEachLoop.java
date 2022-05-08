package com.mycompany.roughwork;

import java.util.Random;

public class forEachLoop {
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] arr = new int[10];
        /*for(int i=0;i<1;)
        {
            i=random.nextInt(1);
            System.out.println(i);
        }*/
        for(int a: arr)
        {
            a = random.nextInt(11);
            System.out.println(a);
        }
        for(int a: arr)
        {
            //a = random.nextInt(11);
            System.out.println(a);
        }
    }
}
