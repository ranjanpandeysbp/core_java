/*12.	Write a program to Convert every word of a user input String to uppercase.*/
package com.mycompany.assignment3;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String to change every word to Uppercase");
        String s1 = sc.nextLine();
        String s2 = s1.toUpperCase();
        System.out.println("String entered is:");
        System.out.println(s1);
        System.out.println("String with all the words in Uppercase is:");
        System.out.println(s2);
    }
}
