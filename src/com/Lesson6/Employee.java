package com.Lesson6;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String departament;

    public Employee(int id, String surname, int age) {
        this(surname, age); // Вызов конструктора в конструкторе
        this.id = id;
    }

    public Employee(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public Employee(int id, String surname, int age, double salary, String departament) {
        this(id, surname, age);
        this.salary = salary;
        this.departament = departament;
    }
}
