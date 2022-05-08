/*1.Write a program to remove all occurrences of a given character from input String?*/
package com.mycompany.day17handson.q1;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args)
    {
        String s1 = null;
        String ch = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        s1 = sc.nextLine();
        System.out.println("String entered is "+s1);
        s1 = s1.trim();

        System.out.println("Enter character");
        ch = sc.nextLine();
        System.out.println("Character entered is "+ch);
        ch = ch.trim();

        String s2 = s1.replaceAll(ch,"");
        System.out.println("Old String "+s1);
        System.out.println("Character replaced "+ch);
        System.out.println("New String "+s2);
    }
}
