package com.Lesson22.homework;

class Pet extends Animal {
    StringBuilder name;
    int tail = 1;
    int paw = 4;

    protected Pet(StringBuilder name) {
        super(2);
        this.name = name;
        System.out.println("I am pet");
    }

    protected void run() {
        System.out.println("Pet runs");
    }

    protected void jump() {
        System.out.println("Pet jumps");
    }
}
