package com.Lesson28.homework;

import com.Lesson10.homework.p1.p2.p3.p4.D;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TZ1 {
    DateTimeFormatter df1 = DateTimeFormatter.ofPattern("Y, MMMM-dd !! hh:mm");
    DateTimeFormatter df2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period period, Duration duration) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Работаем с: " + ldt1.format(df1));
            ldt1 = ldt1.plus(period);
            System.out.println("До: " + ldt1.format(df1));

            System.out.println("Отдыхаем с: " + ldt1.format(df2));
            ldt1.plus(duration);
            System.out.println("До: " + ldt1.format(df2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 31, 18, 0, 0);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(600);


        TZ1 tz1 = new TZ1();
        tz1.smena(ldt1, ldt2, p, d);
    }
}
