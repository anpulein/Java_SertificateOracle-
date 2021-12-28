package com.Lesson6;

public class MethodOverloading {
    void show(int a){
        System.out.println(a);
    }
    void show(boolean a){
        System.out.println(a);
    }
    void show(String a){
        System.out.println(a);
    }

}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading method = new MethodOverloading();
        method.show(1);
        method.show(false);
        method.show("Hi");
    }
}
