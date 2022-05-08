/*16.Write a program to declare 7 days of the week as constants?*/
package com.mycompany.day17handson.q16;

import java.time.DayOfWeek;

public class C16_2 {
    private final String MONDAY;
    private final String TUESDAY;
    private final String WEDNESDAY;
    private final String THURSDAY;
    private final String FRIDAY;
    private final String SATURDAY;
    private final String SUNDAY;

    public C16_2() {
        MONDAY = DayOfWeek.of(1).toString();//Which one is correct
        TUESDAY = DayOfWeek.of(2).toString();
        WEDNESDAY = DayOfWeek.WEDNESDAY.toString();
        THURSDAY = DayOfWeek.THURSDAY.toString();
        FRIDAY = DayOfWeek.FRIDAY.toString();
        SATURDAY = DayOfWeek.SATURDAY.toString();
        SUNDAY = DayOfWeek.SUNDAY.toString();
    }

    public static void main(String[] args)
    {
        C16_2 c = new C16_2();
        //c.MONDAY = "Tuesday";
        System.out.println(c.MONDAY);
        System.out.println(c.TUESDAY);
        System.out.println(c.WEDNESDAY);
        System.out.println(c.THURSDAY);
        System.out.println(c.FRIDAY);
        System.out.println(c.SATURDAY);
        System.out.println(c.SUNDAY);
    }
}
