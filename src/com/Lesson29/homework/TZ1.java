package com.Lesson29.homework;

import com.Lesson10.homework.p1.p2.p3.p4.p5.E;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TZ1 {

}

class Employee {
    String name, departament;
    int salary;

    public Employee(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }
}

class TestEmployee {
    static void printEmployee(Employee emp) {
        System.out.println("Имя: " + emp.name + "\nДолжность: " +  emp.departament +
                "\nЗарплата: " + emp.salary);
    }

    public static void fitraciyaRabotnicov(ArrayList<Employee> arr, Predicate<Employee> t) {
        for(Employee emp : arr) {
            if(t.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        var list = new ArrayList<Employee>();
        Employee p1 = new Employee("Ivan", "IT", 250);
        Employee p2 = new Employee("Elena", "kassir", 150);
        Employee p3 = new Employee("Mariy", "IT", 200);
        Employee p4 = new Employee("Toly", "Toly", 450);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        fitraciyaRabotnicov(list, x -> x.departament == "IT" && x.salary > 200);
        System.out.println("----------------------------------------->");
        fitraciyaRabotnicov(list, x -> x.name.startsWith("E") && x.salary != 450);
        System.out.println("----------------------------------------->");
        fitraciyaRabotnicov(list, x -> x.departament == x.name);
    }
}
