package com.Lesson8.homework;

public class TwoWork {

    static final double pi = 3.14;

    public double ploshad(double radius){
        double p1 = pi * radius * radius;
        return p1;
    }

    public static double dlina(double radius){
        double d1 = 2 * pi * radius;
        return d1;
    }

    public void info(double radius){
        System.out.println("Радиус = " + radius);
        System.out.println("Площад круга = " + dlina(radius));
        System.out.println("Длина окружности = " + dlina(radius));
    }
}

class TwoWortTest{
    public static void main(String[] args) {
        TwoWork work = new TwoWork();
        work.ploshad(5);
        TwoWork.dlina(7.7);
        work.info(3);

    }
}