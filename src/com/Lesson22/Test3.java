package com.Lesson22;

public class Test3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.specializacia = "xirurg";
        doc.eat();
        doc.lechit();
        doc.sleep();
    }
}

class Employee{
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("Kushat");
    }
    void sleep(){
        System.out.println("Spat");
    }
}

class Doctor extends Employee{
    String specializacia;
    void lechit(){
        System.out.println("Lechit");
    }
}

class Teacher extends Employee{
    int lochestvoChelovek;
    void uchit(){
        System.out.println("Uchit");
    }
}

class Driver extends Employee{
    String nameCar;
    void vodit(){
        System.out.println("Vodit");
    }
}
