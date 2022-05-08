/*5.What will be the output of below snippet:
a.	String s1 = "abc";
b.	String s2 = "abc";
c.	System.out.println("s1 == s2 is:" + s1 == s2);
*/
package com.mycompany.day17handson.q5;

public class C5 {
    public static void main(String[] args)
    {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);//false
        System.out.println("s1 == s2 is:" + (s1 == s2));//s1 == s2 is:true
        System.out.println(s1 == s2);//true
        if(s1 == s2){//s1 and s2 are references pointing to the same object in string pool
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }
    }
}
