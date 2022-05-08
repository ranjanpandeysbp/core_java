/*12.How to print date in specific format? Example "MM-dd-yyyy"*/
package com.mycompany.day17handson.q12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class C12_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in MM-dd-yyyy format");
        String sDate = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

        Date date = null;
        try {
            date = sdf.parse(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);

        System.out.println(sdf.format(date));

    }
}
