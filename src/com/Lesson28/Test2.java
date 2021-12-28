package com.Lesson28;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test2 {
    static void smenaDejurnogo(LocalDate start, LocalDate end, Period p) {
        LocalDate data = start;
        while (data.isBefore(end)) {
            System.out.println("Наступила дата " + data + ". Пора менять дежурного");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate end = LocalDate.of(2017, Month.MAY, 31);
        Period p = Period.ofWeeks(1);
        smenaDejurnogo(start, end, p);
    }
}
