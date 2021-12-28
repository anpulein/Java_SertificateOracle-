package com.Lesson6.homework;

class Overloading {
    int sum(){
        return 0;
    }
    int sum(int a){
        return a;
    }
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}

public class OverloadingTest{
    public static void main(String[] args) {
        Overloading over = new Overloading();
        System.out.println(over.sum());
        System.out.println(over.sum(1));
        System.out.println(over.sum(1, 2));
        System.out.println(over.sum(1, 2, 3));
        System.out.println(over.sum(1, 2 ,3 ,4));
    }
}
