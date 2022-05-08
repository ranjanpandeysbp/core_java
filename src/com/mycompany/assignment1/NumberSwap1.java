package com.mycompany.assignment1;

import java.util.Scanner;

public class NumberSwap1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int num1=scanner.nextInt();
        System.out.println("Enter 2nd Number:");
        int num2=scanner.nextInt();
        System.out.println("Entered Numbers are: "+num1+" and "+num2);
        int temp=0;
        //Logic to swap two numbers with third variable
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Swapped Numbers are: "+num1+" and "+num2);
    }
}
