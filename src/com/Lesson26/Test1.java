package com.Lesson26;

import com.Lesson10.homework.p1.p2.p3.C;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "v4");
        Car c2 = new Car("red", "v4");
        Car c3 = new Car("black", "v8");
        var list = new ArrayList<Car>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("black", "v8");
        System.out.println(c1.equals(c2));
    }
}

class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){
            Car c2 = (Car) obj; // Кастинг на Car
            return color.equals(c2.color) && engine.equals(c2.engine);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Mashina cveta " + color + " i s motorom " + engine;
    }
}
