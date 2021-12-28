package com.Lesson20;

public class Test2 {

    static void summa(int ... a){ // Любое кол-во параметров
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        System.out.println(sum);
    }

    public void abc(int[] ... array){ // Любое кол-во массивов

    }

    public static void main(String[] args) {
        summa(1, 2, 3, 6, 5);
        summa(new int[]{1, 2, 3});
    }
}
