package com.Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Jumpable j1 = new Human();
        Jumpable j2 = new Animal();
    }
}

class Human implements Jumpable{}

class Animal implements Jumpable{}

interface Jumpable{}
