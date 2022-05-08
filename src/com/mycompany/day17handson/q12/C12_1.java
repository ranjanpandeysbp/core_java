/*12.How to print date in specific format? Example "MM-dd-yyyy"*/
package com.mycompany.day17handson.q12;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class C12_1 {
    public static void main(String[] args)
    {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println(sdf.format(d));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate ld = LocalDate.now();
        System.out.println(dtf.format(ld));
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(dtf.format(ldt));
    }
}
