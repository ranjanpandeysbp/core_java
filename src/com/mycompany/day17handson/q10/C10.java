/*10.Write a code to show NullPointerException*/
package com.mycompany.day17handson.q10;

public class C10 {
    public static void main(String[] args)
    {
        String s = null;
        s.length();//NPE
        //Exception in thread "main" java.lang.NullPointerException
        //	at com.mycompany.day17handson.q10.C10.main(C10.java:8)
    }
}
