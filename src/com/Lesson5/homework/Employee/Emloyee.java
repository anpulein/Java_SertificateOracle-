package com.Lesson5.homework.Employee;

class Emloyee {

    String id;
    String surname;
    int age;
    int salary;
    String departament;

    public Emloyee(String id, String surname, int age, int salary, String departament) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }

    public void PLus(){
        System.out.println("Изначальная зарплата: " + this.salary);
        this.salary *= 2;
        System.out.println("Итоговая зарпалата: " + this.salary);
    }

}

