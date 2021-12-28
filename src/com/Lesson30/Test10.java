package com.Lesson30;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Our car is " + model + "\ncolor is " + color + "\nengine is " + engine;
    }
}

public class Test10 {
    public static ArrayList<Car> createThreeCar(Supplier<Car> carSupplier) {
        var a1 = new ArrayList<Car>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void ChangeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCar(() -> new Car("Nissan Tilda", "silver metalic", 1.6));
        System.out.println("outCars" + ourCars);

        ChangeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("update car: " + car);});

        System.out.println("OutCars: " + ourCars);
    }

}
