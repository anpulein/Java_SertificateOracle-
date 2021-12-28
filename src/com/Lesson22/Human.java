package com.Lesson22;

public class Human {
    final String pol;

    public Human(String pol) {
        this.pol = pol;
    }
    private String name;
    private int age;
    private int ves;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getVes() {
        return ves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }
    }

    public void setVes(int ves) {
        if (ves > 0){
            this.ves = ves;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Human c = new Human("male");
        c.setName("Kolya");
        c.setAge(15);
        c.setVes(50);
    }
}