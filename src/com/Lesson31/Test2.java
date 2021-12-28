package com.Lesson31;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(30);
        a1.add(150);
        int a = GerMethod.getSecondElement(a1);
        System.out.println(a);
    }
}


class GerMethod {
    public static <T> T getSecondElement(ArrayList<T> aL) {
        return aL.get(1);
    }
}