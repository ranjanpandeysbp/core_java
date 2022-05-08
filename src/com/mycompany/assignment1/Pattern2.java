package com.mycompany.assignment1;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pattern");
        int size = scanner.nextInt();
        int i,j;
        for(i = size; i>0; i--)
        {
            for(j = 0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
