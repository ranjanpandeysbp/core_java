/*8.	What will be the output of below snippet:
a.	String str = null;
b.	String str1="abc";
c.	System.out.println(str1.equals("abc") | str.equals(null));
*/package com.mycompany.day17handson.q8;

public class C8 {
    public static void main(String[] args)
    {
        String str = null;
        String str1="abc";
        System.out.println(str1.equals("abc") | str.equals(null));//Output is: NPE
        //Exception in thread "main" java.lang.NullPointerException
        //	at com.mycompany.day17handson.q8.C8.main(C8.java:12)
        /*String str = "null";
        String str1="abc";
        System.out.println(str.equals(null));//false
        System.out.println(str1.equals("abc") | str.equals(null))//true
        */
    }
}
