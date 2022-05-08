/*6.What will be the output of below snippet:
a.	String s3 = "JavaProgramming";
b.	int start = 1;
c.	char end = 5;
d.	System.out.println(start + end);
e.	System.out.println(s3.substring(start, end));
*/package com.mycompany.day17handson.q6;

public class C6 {
    public static void main(String[] args)
    {
        String s3 = "JavaProgramming";
        int start = 1;
        char end = '5';
        System.out.println(start + end);//Output is 6, why it is not 15
        //System.out.println(s3.substring(start, end));//avaP

        /*
        char end = '5';
        System.out.println(end);//Output is 5, How did this work?
        System.out.println(start + end);//Output is 54, Why did it take the ASCII code of 5 as 53 and then added 1
        */
    }
}
