package com.Lesson25;

import com.Lesson10.homework.p1.p2.p3.p4.p5.E;

public class Test1 {
    public static void main(String[] args) {
//        Driver [] arr1 = {new Driver(), new Driver()};
//        Help_able [] arr3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee [] arr2 = {emp1, emp2, emp3};

//        for (Employee emp: arr2) {
//            emp.work();
//        }
        System.out.println(emp1 instanceof Teacher);
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }
    abstract void work();
}

class Teacher extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Teacher help");
    }

    void work() {
        System.out.println("Teacher works");
    }
}
class Driver extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Driver help");
    }

    void work() {
        System.out.println("Driver works");
    }
}
class Doctor extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Doctor help");
    }

    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help();
}
