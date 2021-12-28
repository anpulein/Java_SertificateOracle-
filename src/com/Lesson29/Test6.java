package com.Lesson29;

import java.util.ArrayList;
import java.util.function.*;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm',22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm',28, 2, 6.4);
        Student st3 = new Student("Elena", 'f',19, 1, 8.9);
        Student st4 = new Student("Petr", 'm',35, 4, 7);
        Student st5 = new Student("Mariya", 'f',23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();
        si.testStudents(list, (Student st) -> {return st.avgGrade > 8.5;});
        System.out.println("-------------------------------------------------->");
        si.testStudents(list, st -> st.avgGrade < 9);
        System.out.println("-------------------------------------------------->");
        si.testStudents(list, (Student st) -> {return st.age > 25;});
        System.out.println("-------------------------------------------------->");
        si.testStudents(list, (Student st) -> {return st.age < 27;});
        System.out.println("-------------------------------------------------->");
        si.testStudents(list, (Student st) -> {return st.sex == 'm';});
        System.out.println("-------------------------------------------------->");
        si.testStudents(list, (Student st) -> {return st.avgGrade > 7.2 && st.age < 23 && st.sex =='f';});

    }
}


class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возвраст: " + st.age + ", курс: " + st.course + ", Средняя оценка: " + st.avgGrade);
    }

    void testStudents(ArrayList <Student> aL, Predicate<Student> t) {
        for (Student s: aL) {
            if(t.test(s)) {
                printStudent(s);
            }
        }
    }
}


