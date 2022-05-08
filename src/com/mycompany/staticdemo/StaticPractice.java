package com.mycompany.staticdemo;

public class StaticPractice {
    //static variable
    static int a = 10;
    static int b;
    int empId = 555;

    //static block
    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }

    {
        b = a * 10;
    }

    //b = a * 10; //This will fail as we are not allowed to write code directly in class

    {
        System.out.println("I am a non static block");
    }

    public StaticPractice()
    {
        System.out.println("Default constructor called");
    }

    static void m1()
    {
        System.out.println("Inside m1");
    }

    public void show()
    {
        //static members are allowed to be accessed within static context
        //static members are allowed to be accessed inside a non static method/context
        System.out.println("Value of a is: "+this.a);//We can access static inside non static
        System.out.println("Value of Employee ID is: "+this.empId);
    }

    public static void display()
    {
        //System.out.println("Value of a is: "+this.a);//'com.mycompany.staticdemo.StaticPractice.this' cannot be referenced from a static context
        //object creation happens later, first static block gets executed
        //this operator cannot be used inside static context
        //System.out.println("Value of Employee ID is: "+this.empId);
        System.out.println("Value of a is: "+a);
        //System.out.println("Value of Employee ID is: "+empId);//Non-static field 'empId' cannot be referenced from a static context
    }

    public static void main(String[] args)
    {
        System.out.println("from main");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        //Creating an object of StaticPractice Class
        StaticPractice sp1 = new StaticPractice();
        sp1.a = 99;//Class Level static variable a is getting modified by sp1 which means from now  on all objects will see the modified value
        sp1.empId = 666;
        StaticPractice sp2 = new StaticPractice();
        System.out.println("Value of sp2.a is "+sp2.a);//99
        System.out.println(StaticPractice.a);//Static members can be also called without object, they can be called directly only with the Class Name and then dot.
        StaticPractice.display();
        display();
        System.out.println("Value of sp2.empId is "+sp2.empId);//555
    }
}
