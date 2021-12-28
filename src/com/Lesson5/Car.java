package com.Lesson5;

public class Car {
    String color;
    String engine;
    int speed;

    int qar(int a){
        speed += a;
        return speed;
    }

    int tormoz(int a){
        speed -= a;
        return speed;
    }

    void showInfo(){
        System.out.println("Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", speed=" + speed +
                '}');
    }

}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.color = "white";
        car1.engine = "v6";
        car1.speed = 60;

        car1.showInfo();

        car1.qar(15);
        car1.showInfo();
        car1.tormoz(3);

        car1.showInfo();
    }
}
