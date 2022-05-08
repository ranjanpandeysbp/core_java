package com.mycompany.assignment1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        System.out.println("Enter the number to be reversed");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();//Integer Variable to store the keyboard input from the user
        int rev = 0;//Variable to store the reverse of the number
        System.out.println("Number entered is "+num);
        /*while(num!=0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            //num = num / 10;
            num /= 10;
            /*System.out.println("Quotient is "+num);
            System.out.println("Remainder is "+digit);
        }
        */
        for(int i=num;i!=0;i=i/10)
        {
            int digit = i % 10;
            rev = rev * 10 + digit;
        }
        System.out.println("Reverse of the Number entered is "+rev);
    }
}
