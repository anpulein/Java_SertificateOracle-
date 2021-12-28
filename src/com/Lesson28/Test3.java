package com.Lesson28;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40, 9);
        LocalTime lt = LocalTime.of(16, 40);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd, yyyy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(f));

//        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(d1));
//
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt);
//        System.out.println(lt.format(d2));

//        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(d4));
//
//        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(ld);
//        System.out.println(ld.format(shortFormat));



    }
}
