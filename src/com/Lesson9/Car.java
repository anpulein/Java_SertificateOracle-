package com.Lesson9;

public class Car {

    String color;
    String engine;
    static int count; // Независимо от экземпляра класса

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
        count++;
    }

    public void showColor(){
        System.out.println("Цвет машины: " + color);
    }

    public void changeColor(String color){
        System.out.println("Цвет машины изенился");
        int cent = 5000;
        this.color = color;
        cent += 1000;
    }

    
}
