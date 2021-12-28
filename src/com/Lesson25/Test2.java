package com.Lesson25;

public class Test2 {
    public static void main(String[] args) {
        Jumpble j = new Man();
        Man m = new Man();
        Student s = new Student();

        if(j instanceof Jumpble) {
            System.out.println("j is Jumpble");
        }
        if(m instanceof Human) {
            System.out.println("m is Human");
        }
        if(m instanceof Human) {
            System.out.println("m is Human");
        }
//        if(s instanceof Human) {
//            System.out.println("s is Human");
//        }
        if(s instanceof Jumpble) {
            System.out.println("s is Jumpble");
        }

    }
}

interface Jumpble {}
class Human implements Jumpble {}
class Man extends Human {}
class Student {}
