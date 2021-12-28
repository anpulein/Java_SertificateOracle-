package com.Lesson22.homework;

class Cat extends Pet {
    public Cat(StringBuilder name) {
        super(name);
        System.out.println("I am cat and my name is: " + this.name);
    }

    protected void sleeo() {
        System.out.println("Cat sleeps");
    }
}
