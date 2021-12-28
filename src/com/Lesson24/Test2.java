package com.Lesson24;

import com.Lesson10.homework.p1.p2.p3.p4.D;

public class Test2 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swip_able s = new Driver();
        Employee e = new Driver();
    }
}


class Employee {
    double salary = 100;
    String name = "Dima";
    int age, experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Driver extends Employee implements Help_able, Swip_able{
    String nameCar;

    @Override
    public void pomosh() {
        System.out.println("Driver helo");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Driver tushit pojar");
    }

    @Override
    public void swip() {
        System.out.println("Driver swim");
    }

    void vodit() {
        System.out.println("Vodit");
    }
}

class Teacher extends Employee implements Help_able {
    int countUchenikov;

    @Override
    public void pomosh() {
        System.out.println("Uchitel help");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }

    void uschit() {
        System.out.println("Uchit");
    }
}

interface Help_able { // Java 7
    void pomosh();

    void tushitPojar();
}

interface Swip_able {
    void swip();
}