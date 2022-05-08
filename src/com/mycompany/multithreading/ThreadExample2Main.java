package com.mycompany.multithreading;

public class ThreadExample2Main {
    public static void  main(String[] args)
    {
        new ThreadDemoTwo("1st Thread");
        new ThreadDemoTwo("2nd Thread");
        new ThreadDemoTwo("3rd Thread");

        try{
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            System.out.println("Interruption occurs in Main Thread");
        }
        System.out.println("We are exiting from Main Thread");
    }
}
