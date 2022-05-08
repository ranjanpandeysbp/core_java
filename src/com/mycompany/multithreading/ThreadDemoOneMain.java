package com.mycompany.multithreading;

public class ThreadDemoOneMain {
    public static void main(String[] args)
    {
        //Creating instance of the class that extend Thread class
        ThreadDemoOne t1 = new ThreadDemoOne();
        //System.out.println(t1);//toString() method is overridden hence it displays the value as Thread[Thread-0,5,main]
        //calling start method to execute the run() method of the Thread class
        t1.start();
    }
}
