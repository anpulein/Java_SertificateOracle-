package com.Lesson4.homework;

public class Student {

    int studentIDNum;
    String firstName;
    String lastName;
    int yeatTeaching;
    double everageMath;
    double everageEconom;
    double everageEnglish;

    public Student(int studentIDNum, String firstName, String lastName,
                   int yeatTeaching, double everageMath, double everageEconom,
                   double everageEnglish) {
        this.studentIDNum = studentIDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yeatTeaching = yeatTeaching;
        this.everageMath = everageMath;
        this.everageEconom = everageEconom;
        this.everageEnglish = everageEnglish;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentIDNum = " + studentIDNum +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", yeatTeaching = " + yeatTeaching +
                ", everage = " + (everageEconom + everageEnglish + everageMath) / 3 +
                '}';
    }
}
