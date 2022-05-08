package com.mycompany.stringdemo;

public class CompareTo {
    public static void main(String[] args)
    {
        String s1 = "apple";
        String s2 = "banana";
        String s3 = "cat";
        String s4 = "apple";
        //compareTo() helps to compare between two strings based on their dictionary order and it returns either 0,+ve or -ve number
        //0 if both strings are equal
        //+ve number if 1st string is greater than the 2nd string
        //-ve number if 2nd string is greater than the 1st string
        System.out.println(s1.compareTo(s2));//s1-s2=97-98=-1
        System.out.println(s2.compareTo(s1));//s2-s1=98-97=1
        System.out.println(s1.compareTo(s4));//s1-s4=97-97=0
        System.out.println(s2.compareTo(s2));//s2-s2=98-98=0
        System.out.println(s1.compareTo(s3));//s1-s3=97-99=-2
        System.out.println(s4.compareTo(s2));//s4-s2=97-98=-1
    }
}
