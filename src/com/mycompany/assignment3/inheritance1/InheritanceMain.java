package com.mycompany.assignment3.inheritance1;

import java.util.Scanner;

public class InheritanceMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String teacher = null;
        String subject = null;
        System.out.println("Enter Teacher Name");
        teacher = sc.nextLine();
        System.out.println("Enter Subject Name");
        subject = sc.nextLine();
        Subject s1 = new Subject(teacher,subject);
        s1.display();
        /*Subject s2 = new Subject("Vivek Sir","Biology");
        s2.display();
        Subject s3 = new Subject("Binod Sir","Physics/Chemistry");
        s3.display();
        */
    }
}
