package com.mycompany.multithreading;

public class ThreadDemoTwo implements Runnable {
    String name;
    Thread thread;

    public ThreadDemoTwo(String name) {
        this.name = name;
        thread = new Thread(this,name);
        System.out.println("New thread : "+thread+"is created\n");
        thread.start();
    }

    @Override
    public void run() {
        try{
            for(int j = 5; j > 0; j--){
                System.out.println(name+": "+j);
                //System.out.println(Thread.currentThread().getName()+": "+j);//same as name
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " thread interrupted");
        }
        System.out.println(name + " thread exiting.");
    }
}
