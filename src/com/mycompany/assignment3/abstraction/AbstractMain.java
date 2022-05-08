package com.mycompany.assignment3.abstraction;

public class AbstractMain {
    public static void main(String[] args)
    {
        TwoWheeler twoWheeler1 = new TwoWheeler("Two Wheeler",10,"good","experienced");
        twoWheeler1.display();
        TwoWheeler twoWheeler2 = new TwoWheeler("Two Wheeler",10,"good","not experienced");
        twoWheeler2.display();
        TwoWheeler twoWheeler3 = new TwoWheeler("Two Wheeler",10,"bad","experienced");
        twoWheeler3.display();
        TwoWheeler twoWheeler4 = new TwoWheeler("Two Wheeler",20,"good","experienced");
        twoWheeler4.display();
        TwoWheeler twoWheeler5 = new TwoWheeler("Two Wheeler",10,"bad","not experienced");
        twoWheeler5.display();
        TwoWheeler twoWheeler6 = new TwoWheeler("Two Wheeler",30,"bad","experienced");
        twoWheeler6.display();
        TwoWheeler twoWheeler7 = new TwoWheeler("Two Wheeler",30,"bad","not experienced");
        twoWheeler7.display();

        FourWheeler fourWheeler1 = new FourWheeler("Four Wheeler",10,"good","experienced");
        fourWheeler1.display();
        FourWheeler fourWheeler2 = new FourWheeler("Four Wheeler",10,"good","not experienced");
        fourWheeler2.display();
        FourWheeler fourWheeler3 = new FourWheeler("Four Wheeler",10,"bad","experienced");
        fourWheeler3.display();
        FourWheeler fourWheeler4 = new FourWheeler("Four Wheeler",20,"good","experienced");
        fourWheeler4.display();
        FourWheeler fourWheeler5 = new FourWheeler("Four Wheeler",10,"bad","not experienced");
        fourWheeler5.display();
        FourWheeler fourWheeler6 = new FourWheeler("Four Wheeler",30,"bad","experienced");
        fourWheeler6.display();
        FourWheeler fourWheeler7 = new FourWheeler("Four Wheeler",30,"bad","not experienced");
        fourWheeler7.display();
    }
}
