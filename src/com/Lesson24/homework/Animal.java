package com.Lesson24.homework;



class Test1 {
    public static void main(String[] args) {

        Mechenosec mechenosec = new Mechenosec("Nata");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.sleep();
        mechenosec.swim();

        Speakable ping = new Pingvin("Lal");
        ping.speak();

        Animal lev = new Lev("Gar");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();

        Mammal mam = new Lev("Tar");
        System.out.println(mam.name);
        mam.run();
    }
}


abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spuat ribi");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{

    public Bird(String name) {
        super(name);
    }
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + "sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }
    abstract void run();
}

class Mechenosec extends Fish {

    public Mechenosec(String name) {
        super(name);
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba, kokoraya bistro plavaet!");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xshnaya riba, i ona est obichi ribiy korm");
    }
}


class Pingvin extends Bird {
    public Pingvin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Pingvin ne umeet letat");
    }

    @Override
    public void speak() {
        System.out.println("Pingvin ne ineet pet kak sollovey");
    }

    @Override
    void eat() {
        System.out.println("Pingvin lyubit prijavshis frug k drugu");
    }

    @Override
    void sleep() {

    }
}

class Lev extends Mammal {
    public Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lev, kak lyuboy xisnik, luabit myaso!");
    }

    @Override
    void sleep() {
        System.out.println("Bolshuya chast dnya lev spit!");
    }

    @Override
    void run() {
        System.out.println("Lev-eto ne samaya bistray koshka");
    }


}


interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}


