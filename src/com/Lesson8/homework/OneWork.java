package com.Lesson8.homework;

public class OneWork {

    static int multiply(int a, int b, int c){
        return a * b * c;
    }

    static void divide(int a, int b){
        System.out.println("Целое: " + a / b + '\t' + "Остаток: " + a % b );
    }
}

class OneWorkTest{
    public static void main(String[] args) {

        System.out.println(OneWork.multiply(1, 2, 3));
        OneWork.divide(1, 2);
        System.out.println(OneWork.multiply(2, 3, 5));
        OneWork.divide(5, 9);
    }
}
