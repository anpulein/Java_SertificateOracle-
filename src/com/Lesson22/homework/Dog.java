package com.Lesson22.homework;

class Dog extends Pet {
    public Dog(StringBuilder name) {
        super(name);
        System.out.println("I am dog and my name is: " + this.name);
    }

    protected void play() {
        System.out.println("Dog plays");
    }
}
