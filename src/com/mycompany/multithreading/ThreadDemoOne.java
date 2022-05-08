package com.mycompany.multithreading;

//By extending Thread class
public class ThreadDemoOne extends Thread {
    //run() method to perform action for thread
    @Override
    public void run()
    {
        int a = 10;
        int b = 12;
        int output = a+b;
        System.out.println("Thread started and it's running");
        System.out.println("Sum is: "+output);
    }
}
