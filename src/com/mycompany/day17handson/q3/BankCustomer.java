/*3.Write a Program to Show Diamond Problem with Multiple Inheritance?*/
package com.mycompany.day17handson.q3;

public class BankCustomer extends ICICIBank/*, SBIBank*/ {//Commented to avoid Diamond Problem
    public static void main(String[] args)
    {
        BankCustomer c = new BankCustomer();
        System.out.println(c.getAccountNo());//Which getAccountNo method should be referred?: Diamond Problem
        //D:\Java_Learning\core-java\src\com\mycompany\day17handson\q3\BankCustomer.java:3:44
        //java: '{' expected
    }
}
