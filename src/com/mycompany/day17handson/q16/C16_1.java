/*16.Write a program to declare 7 days of the week as constants?*/
package com.mycompany.day17handson.q16;

public class C16_1 {
    private final String MONDAY = "Monday";
    private final String TUESDAY = "Tuesday";
    private final String WEDNESDAY = "Wednesday";
    private final String THURSDAY = "Thursday";
    private final String FRIDAY = "Friday";
    private final String SATURDAY = "Saturday";
    private final String SUNDAY = "Sunday";
    public static void main(String[] args)
    {
        C16_1 c = new C16_1();
        //c16.MONDAY = "Tuesday";
        System.out.println(c.MONDAY);
        System.out.println(c.TUESDAY);
        System.out.println(c.WEDNESDAY);
        System.out.println(c.THURSDAY);
        System.out.println(c.FRIDAY);
        System.out.println(c.SATURDAY);
        System.out.println(c.SUNDAY);
    }
}
