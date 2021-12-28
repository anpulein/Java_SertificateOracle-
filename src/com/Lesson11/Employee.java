package com.Lesson11;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvel(double a){
        return a * 2;
    }

    public double zp2(){
        salary = salary * 2;
        return salary;
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}