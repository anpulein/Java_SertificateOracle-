package com.Lesson24;

public class Test1 {
    public static void main(String[] args) {
//        Figure f1 = new Kvadrat();

    }
}

abstract class Figure { // Абстрактный класс

    int count;

    public Figure(int count) {
        this.count = count;
    }

    abstract void perimetr();
    abstract void plosad();
    void showInfo(){
        System.out.println("Это фигура");
    }
}

class Kvadrat extends Figure {

    public Kvadrat(int count, int count1) {
        super(count);
        this.count = count1;
    }

    int storona = 10;
    int count;

    @Override
    void perimetr() {
        System.out.println("Периметр квадрата = " + 4 * storona);
    }

    @Override
    void plosad() {
        System.out.println("Площадь квадрата = " + storona * storona);
    }
}

class Pryamougolnik extends Figure {


    public Pryamougolnik(int count, int storona1, int storona2) {
        super(count);
        this.storona1 = storona1;
        this.storona2 = storona2;
    }

    int storona1 = 8;
    int storona2 = 5;

    @Override
    void perimetr() {
        System.out.println("Периметр прямоугольника = " + 2 * (storona1 + storona2));
    }

    @Override
    void plosad() {
        System.out.println("Площадь квадрата = " + storona1 * storona2);
    }
}

class Okrugnost extends Figure {


    public Okrugnost(int count, int radius) {
        super(count);
        this.radius = radius;
    }

    int radius = 3;

    @Override
    void perimetr() {
        System.out.println("Периметр окружности = " + 2 * 3.14 * radius);
    }

    @Override
    void plosad() {
        System.out.println("Площадь окружности = " + 3.14 * radius * radius);
    }
}
