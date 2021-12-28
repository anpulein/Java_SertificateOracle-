package com.Lesson22.homework;

import com.Lesson10.homework.p1.p2.p3.C;

public class Animal {
    private int eyes;

    protected Animal(int eyes) {
        this.eyes = eyes;
        System.out.println("I am animal");
    }

    protected void eat() {
        System.out.println("Animal eats");
    }

    protected void drink() {
        System.out.println("Animal drinks");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog(new StringBuilder("Pete"));
        System.out.println(dog.paw);
        Cat cat = new Cat(new StringBuilder("Kity"));
        cat.sleeo();
    }
}


