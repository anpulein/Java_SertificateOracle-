package com.Lesson7.homework;

public class Employee {

    private double salary;
    public String surname;
    int id;

    public Employee(double salary) {
        this.salary = salary;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
//        Employee employee_1 = new Employee(1500.54);
//        Employee employee_2 = new Employee("Dima");
//        Employee employee_3 = new Employee(1245);

    }
}

