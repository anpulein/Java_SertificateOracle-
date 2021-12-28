package com.Lesson21.ArrayListsMethods;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        /* REMOVE_ALL
        * Удаляет элементы доп.массива в исходном
         */
        var a11 = new ArrayList<String>();
        a11.add("one");
        a11.add("two");
        a11.add("three");
        a11.add("four");
        a11.add("five");
        System.out.println("array = " + a11);

        var a12 = new ArrayList<String>();
        a12.add("one");
        a12.add("three");
        a12.add("four");
        a12.add("ten");

        a11.removeAll(a12);
        System.out.println("removeAll = " + a11);

        /* RETAIN_ALL
         * Сохраняет элементы доп.массива в исходном
         * Удаляет не нужные элементы
         */
        var a21 = new ArrayList<String>();
        a21.add("one");
        a21.add("two");
        a21.add("three");
        a21.add("four");
        a21.add("five");
        System.out.println("array = " + a21);

        var a22 = new ArrayList<String>();
        a22.add("one");
        a22.add("three");
        a22.add("four");
        a22.add("ten");

        a21.retainAll(a22);
        System.out.println("retainAll = " + a21);

    }
}
