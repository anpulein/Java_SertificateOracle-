package com.Lesson23;

public class Test2 {

}

class Animal {

    String showName() {
        return "some Animal";
    }

    void showInfo() {
        System.out.println("Name of animal: " + showName());
    }
}


class Mouse extends Animal {
    String showName() {
        return "mouse";
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.showInfo();
    }
}
