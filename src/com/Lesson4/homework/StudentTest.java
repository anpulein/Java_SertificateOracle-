package com.Lesson4.homework;

public class StudentTest {
    public static void main(String[] args) {
        Student onePersone = new Student(1, "Dima",
                "Galkin",
                2021, 4.95,
                4.0, 4.25);
        Student twoPersone = new Student(1, "Yulia",
                "Ivanova",
                2020, 5.0,
                4.1, 4.0);
        Student threePersone = new Student(1, "Denis",
                "Gerasimov",
                2021, 4.5,
                4.6, 4.7);

        System.out.println(onePersone);
        System.out.println(twoPersone);
        System.out.println(threePersone);
    }
}
